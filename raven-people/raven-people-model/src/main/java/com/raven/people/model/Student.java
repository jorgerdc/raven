/**
 * Student.java
 * Creation Date: 15/07/2018, 16:50:57
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

import java.io.Serializable;
import java.util.Set;

/**
 * Student model class
 */

public class Student extends User implements Serializable {

	private static final long serialVersionUID = -4497361944703245546L;

	private boolean active;

	private Set<AboutUser> studentAboutSet;

	private Set<Long> studentCareerPlans;

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

	/**
	 * @return the studentAboutSet
	 */
	public Set<AboutUser> getPeopleAboutSet() {
		return studentAboutSet;
	}

	/**
	 * @return the studentCareerPlans
	 */
	public Set<Long> getPeopleCareerPlans() {
		return studentCareerPlans;
	}

	/**
	 * @return the studentAboutSet
	 */
	public Set<AboutUser> getStudentAboutSet() {
		return studentAboutSet;
	}

	/**
	 * @return the studentCareerPlans
	 */
	public Set<Long> getStudentCareerPlans() {
		return studentCareerPlans;
	}

	/**
	 * @param studentAboutSet the studentAboutSet to set
	 */
	public void setStudentAboutSet(Set<AboutUser> studentAboutSet) {
		this.studentAboutSet = studentAboutSet;
	}

	/**
	 * @param studentCareerPlans the studentCareerPlans to set
	 */
	public void setStudentCareerPlans(Set<Long> studentCareerPlans) {
		this.studentCareerPlans = studentCareerPlans;
	}

	/*
	 * See the original documentation of the method declaration
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Student [");
		builder.append(super.toString());
		builder.append(", studentAboutSet=");
		builder.append(studentAboutSet);
		builder.append(", studentCareerPlans=");
		builder.append(studentCareerPlans);
		builder.append(", active=");
		builder.append(active);
		builder.append("]");
		return builder.toString();
	}

}
