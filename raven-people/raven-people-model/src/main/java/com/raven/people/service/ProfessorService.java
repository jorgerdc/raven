/**
 * ProfessorService.java
 * Creation Date: 15/07/2018, 18:44:17
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

package com.raven.people.service;

import java.util.Set;

import com.raven.people.model.Professor;

/**
 * Professor business Service.
 */

public interface ProfessorService {

	/**
	 * Create a new professor
	 * @param professor
	 */
	void createProfessor(Professor professor);

	/**
	 * Search professor using the following criteria:
	 * name, last name, second last name, email, active, course list.
	 * @param professor
	 * @return
	 */
	Set<Professor> searchProfessor(Professor professor);

	/**
	 * Get professor by id. If professor not found, {@link RuntimeException} is thrown.
	 * @param id
	 * @return
	 */
	Professor getProfessorById(Long id);

}
