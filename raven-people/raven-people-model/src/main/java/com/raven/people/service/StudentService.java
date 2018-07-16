/**
 * StudentService.java
 * Creation Date: 15/07/2018, 17:18:15
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

import com.raven.people.model.Student;

/**
 * Business Service for Student model class
 */

public interface StudentService {

	/**
	 * Create a new Student with all the information.
	 * @param student
	 */
	void createStudent(Student student);

	/**
	 * An Student can be created using an email. Later peoples can complete their
	 * information.
	 * @param email
	 */
	void createStudent(String email);

}
