/**
 * User.java
 * Creation Date: 15/07/2018, 17:25:09
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
import java.util.Date;
import java.util.Set;

/**
 * Abstract User model class
 */

public abstract class User implements Serializable {

	private static final long serialVersionUID = -293439811189932652L;

	private Long id;

	private String name;

	private String lastName;

	private String secondLastName;

	private String email;

	private Date birthDate;

	private String password;

	private Date startDate;

	private Set<UserRol> userRols;

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
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the secondLastName
	 */
	public String getSecondLastName() {
		return secondLastName;
	}

	/**
	 * @param secondLastName the secondLastName to set
	 */
	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the userRols
	 */
	public Set<UserRol> getUserRols() {
		return userRols;
	}

	/**
	 * @param userRols the userRols to set
	 */
	public void setUserRols(Set<UserRol> userRols) {
		this.userRols = userRols;
	}

	/*
	 * See the original documentation of the method declaration
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", secondLastName=");
		builder.append(secondLastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", startDate = ");
		builder.append(startDate);
		builder.append(", password=");
		builder.append(password);
		builder.append(", user rols = ");
		builder.append(userRols);
		return builder.toString();
	}
}
