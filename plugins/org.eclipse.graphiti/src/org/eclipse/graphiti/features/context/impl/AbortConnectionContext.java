/**
 * 
 */
package org.eclipse.graphiti.features.context.impl;

import org.eclipse.graphiti.datatypes.ILocation;
import org.eclipse.graphiti.features.context.IAbortConnectionContext;
import org.eclipse.graphiti.internal.features.context.impl.base.DefaultContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;


public class AbortConnectionContext extends DefaultContext implements IAbortConnectionContext {

	private Anchor sourceAnchor;
	private PictogramElement sourcePictogramElement;
	private ILocation sourceLocation;
	
	@Override
	public Anchor getSourceAnchor() {
		return sourceAnchor;
	}
	
	public void setSourceAnchor(Anchor sourceAnchor) {
		this.sourceAnchor = sourceAnchor;
	}

	@Override
	public PictogramElement getSourcePictogramElement() {
		return sourcePictogramElement;
	}

	@Override
	public ILocation getSourceLocation() {
		return sourceLocation;
	}

}
