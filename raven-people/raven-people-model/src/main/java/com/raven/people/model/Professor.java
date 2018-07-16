/**
 * Professor.java
 * Creation Date: 15/07/2018, 17:31:03
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

import java.util.Set;

/**
 * Professor model class
 */

public class Professor extends User {

	private static final long serialVersionUID = 1152733697579764973L;

	private byte[] photo;

	private Set<Long> courses;

	private boolean active;

	/**
	 * @return the photo
	 */
	public byte[] getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	/**
	 * @return the courses
	 */
	public Set<Long> getCourses() {
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(Set<Long> courses) {
		this.courses = courses;
	}

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
		StringBuilder builder = new StringBuilder("Professor [");
		builder.append(super.toString());
		builder.append(", photo (length) =");
		builder.append(photo != null ? photo.length : "No photo");
		builder.append(", courses=");
		builder.append(courses);
		builder.append(", active=");
		builder.append(active);
		builder.append("]");
		return builder.toString();
	}

}
