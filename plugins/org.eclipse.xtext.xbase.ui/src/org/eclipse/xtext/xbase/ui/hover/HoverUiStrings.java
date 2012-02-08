/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xbase.ui.hover;

import org.eclipse.xtext.common.types.JvmAnyTypeReference;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.validation.UIStrings;

/**
 * @author Holger Schill - Initial contribution and API
 */
public class HoverUiStrings extends UIStrings {

	protected String formalParametersToString(Iterable<? extends JvmFormalParameter> elements) {
		StringBuilder buffer = new StringBuilder();
		boolean needsSeparator = false;
		for (JvmFormalParameter parameter : elements) {
			if (needsSeparator)
				buffer.append(", ");
			needsSeparator = true;
			JvmTypeReference typeRef = parameter.getParameterType();
			if(typeRef != null) {
				if (typeRef instanceof JvmAnyTypeReference)
					buffer.append("Object");
				else
					buffer.append(typeRef.getSimpleName());
			} else 
				buffer.append("[null]");
			buffer.append(" " + parameter.getName());
		}
		return buffer.toString();
	}
	
	@Override
	protected String parameterTypes(Iterable<JvmFormalParameter> parameters) {
		return formalParametersToString(parameters);
	}
}
