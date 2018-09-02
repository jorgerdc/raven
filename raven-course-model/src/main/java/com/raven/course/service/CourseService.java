/**
 * CourseService.java
 * Creation Date: 06/07/2018, 23:16:46
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

package com.raven.course.service;

import com.raven.course.model.Course;

/**
 * Business Service to manage courses.
 */

public interface CourseService {

	/**
	 * create a new course. The following data is stored: General data, course topics,
	 * modalities and resources
	 * @param course
	 */
	void createCourse(Course course);

}
