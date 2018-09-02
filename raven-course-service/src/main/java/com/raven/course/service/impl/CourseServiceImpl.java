/**
 * CourseServiceImpl.java
 * Creation Date: 07/07/2018, 00:01:13
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
import com.raven.course.dao.CourseDAO;
import com.raven.course.dao.CourseResourceDAO;
import com.raven.course.dao.TopicCourseDAO;
import com.raven.course.model.Course;
import com.raven.course.service.CourseService;

/**
 * Course Service implementation
 */

@Service("courseService")
public class CourseServiceImpl implements CourseService {

	@Resource
	private CourseDAO courseDAO;

	@Resource
	private CourseResourceDAO courseResourceDAO;

	@Resource
	private CareerPlanDAO careerPlanDAO;

	@Resource
	private TopicCourseDAO topicCourseDAO;

	private static final Logger log = LoggerFactory.getLogger(CourseServiceImpl.class);

	/*
	 * See the original documentation of the method declaration
	 * @see
	 * com.raven.course.service.CourseService#createCourse(com.raven.course.model.Course)
	 */
	@Override
	@Transactional
	public void createCourse(Course course) {

		log.debug("Creating new course {}", course);

		courseDAO.create(course);

		log.debug("Adding modalities");

		courseDAO.addModalities(course.getModalities(), course.getId());

		log.debug("Creating course topics");

		topicCourseDAO.createTopicTree(course.getRootTopic());

		log.debug("Creating resources");

		courseResourceDAO.addResources(course.getResources(), course.getId());

		log.debug("Course created.");

	}
}
