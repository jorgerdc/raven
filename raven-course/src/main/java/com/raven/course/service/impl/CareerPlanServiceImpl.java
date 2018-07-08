/**
 * CareerPlanServiceImpl.java
 * Creation Date: 07/07/2018, 10:36:18
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

package com.raven.course.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raven.course.dao.CareerPlanDAO;
import com.raven.course.model.CareerPlan;
import com.raven.course.model.CourseCareerPlan;
import com.raven.course.service.CareerPlanService;

/**
 * Career Plan business Service
 */

@Service("careerPlanService")
public class CareerPlanServiceImpl implements CareerPlanService {

	@Resource
	CareerPlanDAO careerPlanDAO;

	private static final Logger log = LoggerFactory.getLogger(CareerPlanServiceImpl.class);

	/*
	 * See the original documentation of the method declaration
	 * @see com.raven.course.service.CareerPlanService#createPlan(com.raven.course.model.
	 * CareerPlan)
	 */
	@Override
	@Transactional
	public void createPlan(CareerPlan plan) {

		log.debug("Creating new career plan");
		careerPlanDAO.create(plan);

	}

	/*
	 * See the original documentation of the method declaration
	 * @see
	 * com.raven.course.service.CareerPlanService#addCourseToCarrePlan(com.raven.course.
	 * model.CourseCareerPlan)
	 */
	@Override
	@Transactional
	public void addCourseToCarrePlan(CourseCareerPlan courseCarrerPlan) {
		log.debug("Adding course to career path");
		careerPlanDAO.addCourseToPlan(courseCarrerPlan);

	}

}
