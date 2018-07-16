/**
 * CareerPlanDAO.java
 * Creation Date: 06/07/2018, 23:56:21
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

import com.raven.course.model.CareerPlan;
import com.raven.course.model.Course;
import com.raven.course.model.CourseCareerPlan;

/**
 * CareerPlan Data Access Object
 */

public interface CareerPlanDAO {

	/**
	 * @param plan
	 */
	void create(CareerPlan plan);

	/**
	 * Creates {@link Course} - {@link CareerPlan} association
	 * @param courseCareerPlan
	 */
	void addCourseToPlan(CourseCareerPlan courseCareerPlan);

}
