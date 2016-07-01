/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *   Jan Koehnlein - Initial API and implementation
 *******************************************************************************/
package org.eclipse.xtext.xtext.ui.graph.figures;

import org.eclipse.draw2d.IFigure;
import org.eclipse.xtext.xtext.ui.graph.figures.primitives.CrossPoint;

/**
 * Interface for all building blocks of a railroad diagram.
 * 
 * @author Jan Koehnlein - Initial contribution and API
 */
public interface ISegmentFigure extends IFigure, IEObjectReferer {

	CrossPoint getEntry();

	CrossPoint getExit();
}