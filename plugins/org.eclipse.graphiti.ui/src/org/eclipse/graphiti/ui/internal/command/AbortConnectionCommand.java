package org.eclipse.graphiti.ui.internal.command;

import java.util.List;

import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.context.impl.AbortConnectionContext;
import org.eclipse.graphiti.internal.command.CommandExec;
import org.eclipse.graphiti.internal.command.GenericFeatureCommandWithContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.internal.Messages;
import org.eclipse.graphiti.ui.internal.config.IConfigurationProvider;

public class AbortConnectionCommand extends AbstractCommand {

	private List<IFeature> features;

	/** Start endpoint for the connection. */
	private final PictogramElement sourceObject;
	
	public AbortConnectionCommand(IConfigurationProvider configurationProvider, PictogramElement pe, List<IFeature> features) {
		super(configurationProvider);
		setLabel(Messages.AbortConnectionCommand_0_xmsg);

		this.features = features;
		this.sourceObject = pe;
	}
	
	@Override
	public boolean canExecute() {
		return true;
	}
	
	@Override
	public void execute() {
		
		AbortConnectionContext abortContext = new AbortConnectionContext();
		abortContext.setSourceAnchor(getAnchor(sourceObject));

		IFeature found = null;		
		for (IFeature feature : features) {
			if (feature instanceof ICreateConnectionFeature) {
				found = feature;
				break;
			}
		}
		
		if (found == null)
			return;
		
		GenericFeatureCommandWithContext ccc = new GenericFeatureCommandWithContext(found, abortContext);
		if (ccc.canExecute())
			try {
				CommandExec.getSingleton().executeCommand(ccc, getTransactionalEditingDomain());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	private Anchor getAnchor(PictogramElement pe) {
		Anchor ret = null;
		if (pe instanceof Anchor) {
			ret = (Anchor) pe;
		} else if (pe instanceof AnchorContainer) {
			ret = Graphiti.getPeService().getChopboxAnchor((AnchorContainer) pe);
		}
		return ret;
	}
	
}
