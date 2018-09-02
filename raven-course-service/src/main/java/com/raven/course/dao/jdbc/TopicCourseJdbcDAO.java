/**
 * TopicCourseJdbcDAO.java
 * Creation Date: 07/07/2018, 18:33:08
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

package com.raven.course.dao.jdbc;

import org.springframework.stereotype.Repository;

import com.raven.course.dao.TopicCourseDAO;
import com.raven.course.model.CourseTopic;

/**
 * TODO [Add class documentation]
 */
@Repository("topicCourseDAO")
public class TopicCourseJdbcDAO extends GenericJdbcDAO implements TopicCourseDAO {

	/*
	 * See the original documentation of the method declaration
	 * @see com.raven.course.dao.TopicCourseDAO#createTopicTree(com.raven.course.model.
	 * CourseTopic)
	 */
	@Override
	public void createTopicTree(CourseTopic rootTopic) {
		// TODO Auto-generated method stub

	}

}
