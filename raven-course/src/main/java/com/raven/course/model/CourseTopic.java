/**
 * CourseTopic.java
 * Creation Date: 06/07/2018, 22:30:43
 *
 * Copyright (C) The Project *raven-course* Authors.
 *
 * This software was created for didactic and academic purposes.
 * It can be used and even modified by referring to the author
 * or project on GitHub. If the file is modified, add a note
 * after this paragraph saying that this file is a modified version.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package com.raven.course.model;

import java.io.Serializable;

/**
 * CourseTopic model class
 */

public class CourseTopic implements Serializable {

	private static final long serialVersionUID = 3886080468136313712L;

	private Long id;

	private String number;

	private String name;

	private CourseTopic parentTopic;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the parentTopic
	 */
	public CourseTopic getParentTopic() {
		return parentTopic;
	}

	/**
	 * @param parentTopic the parentTopic to set
	 */
	public void setParentTopic(CourseTopic parentTopic) {
		this.parentTopic = parentTopic;
	}

	/*
	 * See the original documentation of the method declaration
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CourseTopic [id=");
		builder.append(id);
		builder.append(", number=");
		builder.append(number);
		builder.append(", name=");
		builder.append(name);
		builder.append(", parentTopic=");
		builder.append(parentTopic);
		builder.append("]");
		return builder.toString();
	}

}
