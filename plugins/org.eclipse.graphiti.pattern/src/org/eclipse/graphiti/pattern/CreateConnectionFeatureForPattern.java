/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2011 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *    mwenz - Bug 324859 - Need Undo/Redo support for Non-EMF based domain objects
 *
 * </copyright>
 *
 *******************************************************************************/
package org.eclipse.graphiti.pattern;

import org.eclipse.graphiti.features.ICustomUndoableFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAbortConnectionContext;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Connection;

/**
 * The Class CreateConnectionFeatureForPattern.
 */
public class CreateConnectionFeatureForPattern extends AbstractCreateConnectionFeature implements ICustomUndoableFeature {
	private IConnectionPattern delegate;

	/**
	 * Creates a new {@link CreateConnectionFeatureForPattern}.
	 * 
	 * @param featureProvider
	 *            the feature provider
	 * @param pattern
	 *            the connection pattern
	 */
	public CreateConnectionFeatureForPattern(IFeatureProvider featureProvider, IConnectionPattern pattern) {
		super(featureProvider, pattern.getCreateName(), pattern.getCreateDescription());
		delegate = pattern;
	}

	public boolean canCreate(ICreateConnectionContext context) {
		boolean ret = delegate.canCreate(context);
		return ret;
	}

	public boolean canStartConnection(ICreateConnectionContext context) {
		return delegate.canStartConnection(context);
	}

	public Connection create(ICreateConnectionContext context) {
		return delegate.create(context);
	}

	@Override
	public void cancel(IAbortConnectionContext context) {
		delegate.cancel(context);
	}

	@Override
	public String getCreateImageId() {
		return delegate.getCreateImageId();
	}

	@Override
	public String getCreateLargeImageId() {
		return delegate.getCreateLargeImageId();
	}

	@Override
	public boolean canUndo(IContext context) {
		if (delegate instanceof ICustomUndoablePattern) {
			return ((ICustomUndoablePattern) delegate).canUndo(this, context);
		}
		return super.canUndo(context);
	}

	/**
	 * @since 0.8
	 */
	@Override
	public void undo(IContext context) {
		if (delegate instanceof ICustomUndoablePattern) {
			((ICustomUndoablePattern) delegate).undo(this, context);
		}
	}

	/**
	 * @since 0.8
	 */
	@Override
	public boolean canRedo(IContext context) {
		if (delegate instanceof ICustomUndoablePattern) {
			return ((ICustomUndoablePattern) delegate).canRedo(this, context);
		}
		return true;
	}

	/**
	 * @since 0.8
	 */
	@Override
	public void redo(IContext context) {
		if (delegate instanceof ICustomUndoablePattern) {
			((ICustomUndoablePattern) delegate).redo(this, context);
		}
	}

}
