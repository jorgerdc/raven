/**
 * UserRol.java
 * Creation Date: 15/07/2018, 18:23:58
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
 * Rol User static catalog.
 */

public enum UserRol {

	/**
	 * 1- Student
	 */
	STUDENT(1, "Student", "Student", true),

	/**
	 * 2 - Professor
	 */
	PROFESSOR(2, "Professor", "Professor", true),

	/**
	 * 3 - System Administrator
	 */
	ADMIN(3, "Admin", "System administratror", true);

	private Integer id;

	private String name;

	private String description;

	private boolean active;

	/**
	 * TODO [Add constructor documentation]
	 * @param id
	 * @param name
	 * @param description
	 * @param active
	 */
	private UserRol(Integer id, String name, String description, boolean active) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.active = active;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

}
