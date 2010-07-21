/**
 * <copyright>
 * 
 * Copyright (c) 2005, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 * 
 * </copyright>
 *
 * $Id: AdaptedGradientColoredAreas.java,v 1.1 2010/07/21 12:34:45 jpasch Exp $
 */
package org.eclipse.graphiti.mm.pictograms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adapted Gradient Colored Areas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.graphiti.mm.pictograms.AdaptedGradientColoredAreas#getDefinedStyleId <em>Defined Style Id</em>}</li>
 *   <li>{@link org.eclipse.graphiti.mm.pictograms.AdaptedGradientColoredAreas#getAdaptedGradientColoredAreas <em>Adapted Gradient Colored Areas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.graphiti.mm.pictograms.PictogramsPackage#getAdaptedGradientColoredAreas()
 * @model
 * @generated
 */
public interface AdaptedGradientColoredAreas extends EObject {
	/**
	 * Returns the value of the '<em><b>Defined Style Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined Style Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Style Id</em>' attribute.
	 * @see #setDefinedStyleId(String)
	 * @see org.eclipse.graphiti.mm.pictograms.PictogramsPackage#getAdaptedGradientColoredAreas_DefinedStyleId()
	 * @model
	 * @generated
	 */
	String getDefinedStyleId();

	/**
	 * Sets the value of the '{@link org.eclipse.graphiti.mm.pictograms.AdaptedGradientColoredAreas#getDefinedStyleId <em>Defined Style Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined Style Id</em>' attribute.
	 * @see #getDefinedStyleId()
	 * @generated
	 */
	void setDefinedStyleId(String value);

	/**
	 * Returns the value of the '<em><b>Adapted Gradient Colored Areas</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.graphiti.mm.pictograms.GradientColoredAreas}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapted Gradient Colored Areas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapted Gradient Colored Areas</em>' containment reference list.
	 * @see org.eclipse.graphiti.mm.pictograms.PictogramsPackage#getAdaptedGradientColoredAreas_AdaptedGradientColoredAreas()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<GradientColoredAreas> getAdaptedGradientColoredAreas();

} // AdaptedGradientColoredAreas
