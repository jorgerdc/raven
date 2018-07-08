/**
 * CourseDAO.java
 * Creation Date: 06/07/2018, 23:28:19
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

package com.raven.course.dao;

import java.util.Set;

import com.raven.course.model.Course;
import com.raven.course.model.CourseModality;

/**
 * Data Access Object for a Course
 */

public interface CourseDAO {

	/**
	 * Creates a new course
	 * @param course
	 */
	void create(Course course);

	/**
	 * Add course modalities
	 * @param modalities
	 * @param courseId
	 */
	void addModalities(Set<CourseModality> modalities, Long courseId);

}
