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
 * $Id: AdaptedGradientColoredAreasImpl.java,v 1.1 2010/07/21 12:34:45 jpasch Exp $
 */
package org.eclipse.graphiti.mm.pictograms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.graphiti.mm.pictograms.AdaptedGradientColoredAreas;
import org.eclipse.graphiti.mm.pictograms.GradientColoredAreas;
import org.eclipse.graphiti.mm.pictograms.PictogramsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adapted Gradient Colored Areas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.graphiti.mm.pictograms.impl.AdaptedGradientColoredAreasImpl#getDefinedStyleId <em>Defined Style Id</em>}</li>
 *   <li>{@link org.eclipse.graphiti.mm.pictograms.impl.AdaptedGradientColoredAreasImpl#getAdaptedGradientColoredAreas <em>Adapted Gradient Colored Areas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdaptedGradientColoredAreasImpl extends EObjectImpl implements AdaptedGradientColoredAreas {
	/**
	 * The default value of the '{@link #getDefinedStyleId() <em>Defined Style Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedStyleId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINED_STYLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinedStyleId() <em>Defined Style Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedStyleId()
	 * @generated
	 * @ordered
	 */
	protected String definedStyleId = DEFINED_STYLE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdaptedGradientColoredAreas() <em>Adapted Gradient Colored Areas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptedGradientColoredAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<GradientColoredAreas> adaptedGradientColoredAreas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptedGradientColoredAreasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PictogramsPackage.Literals.ADAPTED_GRADIENT_COLORED_AREAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinedStyleId() {
		return definedStyleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedStyleId(String newDefinedStyleId) {
		String oldDefinedStyleId = definedStyleId;
		definedStyleId = newDefinedStyleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PictogramsPackage.ADAPTED_GRADIENT_COLORED_AREAS__DEFINED_STYLE_ID, oldDefinedStyleId, definedStyleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GradientColoredAreas> getAdaptedGradientColoredAreas() {
		if (adaptedGradientColoredAreas == null) {
			adaptedGradientColoredAreas = new EObjectContainmentEList.Resolving<GradientColoredAreas>(GradientColoredAreas.class, this, PictogramsPackage.ADAPTED_GRADIENT_COLORED_AREAS__ADAPTED_GRADIENT_COLORED_AREAS);
		}
		return adaptedGradientColoredAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PictogramsPackage.ADAPTED_GRADIENT_COLORED_AREAS__ADAPTED_GRADIENT_COLORED_AREAS:
				return ((InternalEList<?>)getAdaptedGradientColoredAreas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PictogramsPackage.ADAPTED_GRADIENT_COLORED_AREAS__DEFINED_STYLE_ID:
				return getDefinedStyleId();
			case PictogramsPackage.ADAPTED_GRADIENT_COLORED_AREAS__ADAPTED_GRADIENT_COLORED_AREAS:
				return getAdaptedGradientColoredAreas();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PictogramsPackage.ADAPTED_GRADIENT_COLORED_AREAS__DEFINED_STYLE_ID:
				setDefinedStyleId((String)newValue);
				return;
			case PictogramsPackage.ADAPTED_GRADIENT_COLORED_AREAS__ADAPTED_GRADIENT_COLORED_AREAS:
				getAdaptedGradientColoredAreas().clear();
				getAdaptedGradientColoredAreas().addAll((Collection<? extends GradientColoredAreas>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PictogramsPackage.ADAPTED_GRADIENT_COLORED_AREAS__DEFINED_STYLE_ID:
				setDefinedStyleId(DEFINED_STYLE_ID_EDEFAULT);
				return;
			case PictogramsPackage.ADAPTED_GRADIENT_COLORED_AREAS__ADAPTED_GRADIENT_COLORED_AREAS:
				getAdaptedGradientColoredAreas().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PictogramsPackage.ADAPTED_GRADIENT_COLORED_AREAS__DEFINED_STYLE_ID:
				return DEFINED_STYLE_ID_EDEFAULT == null ? definedStyleId != null : !DEFINED_STYLE_ID_EDEFAULT.equals(definedStyleId);
			case PictogramsPackage.ADAPTED_GRADIENT_COLORED_AREAS__ADAPTED_GRADIENT_COLORED_AREAS:
				return adaptedGradientColoredAreas != null && !adaptedGradientColoredAreas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (definedStyleId: ");
		result.append(definedStyleId);
		result.append(')');
		return result.toString();
	}

} //AdaptedGradientColoredAreasImpl
