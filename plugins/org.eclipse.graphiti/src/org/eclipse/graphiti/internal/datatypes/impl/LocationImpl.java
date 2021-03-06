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
package org.eclipse.graphiti.internal.datatypes.impl;

import org.eclipse.graphiti.datatypes.IAdvancedLocation;
import org.eclipse.graphiti.datatypes.ILocation;

/**
 * The Class LocationImpl.
 * 
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @noextend This class is not intended to be subclassed by clients.
 */
public class LocationImpl implements IAdvancedLocation {

	private int x;

	private int y;

	public LocationImpl(int x, int y) {
		setX(x);
		setY(y);
	}

	public LocationImpl(ILocation location) {
		this(location.getX(), location.getY());
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o instanceof LocationImpl) {
			LocationImpl l = (LocationImpl) o;
			return l.x == x && l.y == y;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (x * y) ^ (x + y);
	}

	@Override
	public String toString() {
		return "Location(" + x + ", " + y + ")"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	public ILocation getLocationCopy() {
		return new LocationImpl(this);
	}

	public ILocation setLocation(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}

	public ILocation setLocation(ILocation location) {
		return setLocation(location.getX(), location.getY());
	}

	public void scale(double amount) {
		x = (int) Math.floor(x * amount);
		y = (int) Math.floor(y * amount);
	}

	public ILocation translate(int dx, int dy) {
		x += dx;
		y += dy;
		return this;
	}
}
