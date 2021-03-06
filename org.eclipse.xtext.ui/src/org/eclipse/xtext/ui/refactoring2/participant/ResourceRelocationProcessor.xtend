/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.refactoring2.participant

import com.google.inject.Inject
import java.util.List
import java.util.Set
import org.apache.log4j.Logger
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.OperationCanceledException
import org.eclipse.ltk.core.refactoring.resource.MoveResourceChange
import org.eclipse.ltk.core.refactoring.resource.RenameResourceChange
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.ide.refactoring.ResourceRelocationChange
import org.eclipse.xtext.ide.refactoring.ResourceRelocationContext
import org.eclipse.xtext.ide.refactoring.ResourceRelocationContext.ChangeType
import org.eclipse.xtext.ide.serializer.IChangeSerializer
import org.eclipse.xtext.ui.refactoring2.ChangeConverter
import org.eclipse.xtext.ui.refactoring2.LtkIssueAcceptor
import org.eclipse.xtext.ui.refactoring2.ResourceURIConverter
import org.eclipse.xtext.ui.resource.IResourceSetProvider
import org.eclipse.xtext.ui.resource.LiveScopeResourceSetInitializer

import static org.eclipse.xtext.ide.refactoring.RefactoringIssueAcceptor.Severity.*

/**
 * @author koehnlein - Initial contribution and API
 * @since 2.13
 */
class ResourceRelocationProcessor {

	static val LOG = Logger.getLogger(ResourceRelocationProcessor)

	@Inject IResourceSetProvider resourceSetProvider
	@Inject LiveScopeResourceSetInitializer liveScopeResourceSetInitializer
	@Accessors(PACKAGE_GETTER) @Inject LtkIssueAcceptor issues
	@Inject extension ResourceURIConverter
	@Inject IChangeSerializer changeSerializer
	@Inject ResourceRelocationStrategyRegistry strategyRegistry
	@Inject ChangeConverter.Factory changeConverterFactory

	List<ResourceRelocationChange> uriChanges = newArrayList()

	Set<IResource> excludedResources = newHashSet()

	IProject project // TODO: multi-project move

	def createChange(String name, ChangeType type,
					IProgressMonitor pm) throws CoreException, OperationCanceledException {
		if (uriChanges.empty)
			return null
		val resourceSet = resourceSetProvider.get(project)
		liveScopeResourceSetInitializer.initialize(resourceSet)
		val context = new ResourceRelocationContext(type, uriChanges, issues, changeSerializer, resourceSet)
		executeParticipants(context)
		val changeConverter = changeConverterFactory.create(name, [
			(!(it instanceof MoveResourceChange || it instanceof RenameResourceChange)
				|| !excludedResources.contains(modifiedElement))
		], issues)
		changeSerializer.applyModifications(changeConverter)
		return changeConverter.change
	}

	protected def void executeParticipants(ResourceRelocationContext context) {
		val strategies = strategyRegistry.strategies
		if(context.changeType === ResourceRelocationContext.ChangeType.COPY) {
			context.changeSerializer.updateRelatedFiles = false
		}
		strategies.forEach [
			try {
				applyChange(context)
			} catch (Throwable t) {
				issues.add(ERROR, 'Error applying resource changes', t)
				LOG.error(t.message, t)
			}
		]
	}

	def void addChangedResource(IResource resource, IPath fromPath, IPath toPath) {
		if (project === null)
			project = resource.project

		if (fromPath.isPrefixOf(resource.fullPath)) {
			val oldURI = resource.toURI
			val newURI = toPath.append(resource.fullPath.removeFirstSegments(fromPath.segmentCount)).toURI
			excludedResources.add(resource)
			if (resource instanceof IFile) {
				val uriChange = new ResourceRelocationChange(oldURI, newURI, true)
				uriChanges += uriChange
			} else if (resource instanceof IContainer) {
				val uriChange = new ResourceRelocationChange(oldURI, newURI, false)
				uriChanges += uriChange
				resource.members.forEach [ member |
					addChangedResource(member, fromPath, toPath)
				]
			}
		}
	}
}