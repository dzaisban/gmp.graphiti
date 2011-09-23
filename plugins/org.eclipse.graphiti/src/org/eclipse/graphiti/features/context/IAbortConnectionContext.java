package org.eclipse.graphiti.features.context;

import org.eclipse.graphiti.datatypes.ILocation;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

public interface IAbortConnectionContext extends IContext {
	Anchor getSourceAnchor();
	PictogramElement getSourcePictogramElement();
	ILocation getSourceLocation();
}
