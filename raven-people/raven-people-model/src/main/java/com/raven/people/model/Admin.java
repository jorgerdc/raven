/**
 * Admin.java
 * Creation Date: 15/07/2018, 18:40:06
 *
 * Copyright (C) The Project *raven-people-model* Authors.
 *
 * This software was created for didactic and academic purposes.
 * It can be used and even modified by referring to the author
 * or project on GitHub. If the file is modified, add a note
 * after this paragraph saying that this file is a modified version.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package com.raven.people.model;

/**
 * System administrator model class
 */

public class Admin extends User {

	private static final long serialVersionUID = 1276900839546185566L;

	private boolean active;

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/*
	 * See the original documentation of the method declaration
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Admin [");
		builder.append(super.toString());
		builder.append(", active=");
		builder.append(active);
		builder.append("]");
		return builder.toString();
	}
}
