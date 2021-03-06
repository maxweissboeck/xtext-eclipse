/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;

import com.google.inject.ImplementedBy;

/**
 * The {@link IValidationJobScheduler scheduler} is used to decide about an initially
 * triggered validation for a freshly opened {@link IXtextDocument document}.
 * @see ValidationJobScheduler
 * @author Sebastian Zarnekow - Initial contribution and API
 * @since 2.1
 */
@ImplementedBy(ValidationJobScheduler.class)
public interface IValidationJobScheduler {

	/**
	 * Optionally triggers the validation on the given {@link IXtextDocument document}
	 */
	void scheduleInitialValidation(IXtextDocument document);
	
}
