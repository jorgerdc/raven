/**
 * CourseResourceDAO.java
 * Creation Date: 06/07/2018, 23:35:22
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

import com.raven.course.model.CourseResource;

/**
 * Resource Course Data Access Object
 */

public interface CourseResourceDAO {

	/**
	 * Add this list of resources to specific courses.
	 * @param resources
	 * @param courseId
	 */
	void addResources(Set<CourseResource> resources, Long courseId);

}
