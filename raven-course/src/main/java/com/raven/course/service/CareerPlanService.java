/**
 * CarrerPlanService.java
 * Creation Date: 06/07/2018, 23:19:13
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

import com.raven.course.model.CareerPlan;
import com.raven.course.model.CourseCareerPlan;

/**
 * Business service used to control the Career plan catalog
 */

public interface CareerPlanService {

	/**
	 * Creates a new plan
	 * @param plan
	 */
	void createPlan(CareerPlan plan);

	/**
	 * Adds a new course in a career path
	 * @param courseCarrerPlan
	 */
	void addCourseToCarrePlan(CourseCareerPlan courseCarrerPlan);

}
