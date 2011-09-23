/*******************************************************************************
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
 *******************************************************************************/
package org.eclipse.graphiti.func;

import org.eclipse.graphiti.features.context.IAbortConnectionContext;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.mm.pictograms.Connection;

/**
 * The Interface ICreateConnection.
 * 
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface ICreateConnection extends ICreateInfo {

	/**
	 * Can create.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true, if successful
	 */
	boolean canCreate(ICreateConnectionContext context);

	/**
	 * Creates the.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return the connection
	 */
	Connection create(ICreateConnectionContext context);

	/**
	 * Can start connection.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true, if successful
	 */
	boolean canStartConnection(ICreateConnectionContext context);
	
	/**
	 * Cancels connection
	 * @param context
	 */
	void cancel(IAbortConnectionContext context);

}
