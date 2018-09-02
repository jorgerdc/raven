/**
 * CourseJdbcDAO.java
 * Creation Date: 07/07/2018, 11:47:59
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

import java.util.Set;

import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.stereotype.Repository;

import com.raven.course.dao.CourseDAO;
import com.raven.course.model.Course;
import com.raven.course.model.CourseModality;

/**
 * JDBC DAO implementation
 */

@Repository("courseDAO")
public class CourseJdbcDAO extends GenericJdbcDAO implements CourseDAO {

	private LobHandler lobHandler = new DefaultLobHandler();

	private static final String course_seq = "course_seq";

	private static final String course_modality_seq = "course_modality_seq";

	private static final String course_insert_sql = "insert into course"
		+ "(course_id,name,description,adquired_ack,total_hours,logo,landing_page,"
		+ "course_status_id,course_topic_id) values(?,?,?,?,?,?,?,?,?)";

	private static final String course_modalities_insert = "insert into course_resource "
		+ "(course_modality_id,course_id,modality_id) values(?,?,?)";

	/*
	 * See the original documentation of the method declaration
	 * @see com.raven.course.dao.CourseDAO#create(com.raven.course.model.Course)
	 */
	@Override
	public void create(Course course) {
		Long id;
		int result;

		id = getNextId(course_seq);
		result = getJdbcTemplate().update(course_insert_sql, id, course.getName(),
			course.getDescription(), course.getAdquiredAck(), course.getTotalHours(),
			new SqlLobValue(course.getLogo(), lobHandler), course.getLandingPage(),
			course.getStatus().getId(), course.getRootTopic().getId());

		checkRowUpdated(1, result);

		course.setId(id);

	}

	/*
	 * See the original documentation of the method declaration
	 * @see com.raven.course.dao.CourseDAO#addModalities(java.util.Set)
	 */
	@Override
	public void addModalities(Set<CourseModality> modalities, Long courseId) {

		modalities.forEach(modality -> {

			Long id;
			int result;

			id = getNextId(course_modality_seq);
			result = getJdbcTemplate().update(course_modalities_insert, id, courseId,
				modality.getId());

			checkRowUpdated(1, result);

		});

	}

}
