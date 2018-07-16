/**
 * StudentDAOJdbc.java
 * Creation Date: 15/07/2018, 20:08:53
 *
 * Copyright (C) The Project *raven-people-service* Authors.
 *
 * This software was created for didactic and academic purposes.
 * It can be used and even modified by referring to the author
 * or project on GitHub. If the file is modified, add a note
 * after this paragraph saying that this file is a modified version.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package com.raven.people.dao.jdbc;

import org.springframework.stereotype.Repository;

import com.raven.people.dao.StudentDAO;
import com.raven.people.model.Student;
import com.raven.people.model.UserRol;

/**
 * Student JDBC Dao
 */
@Repository("studentDAO")
public class StudentDAOJdbc extends GenericJdbcDAO implements StudentDAO {

	private static final String user_seq = "user_seq";

	private static final String career_plan_student_seq = "career_plan_student_seq";

	private static final String user_insert_sql = "insert into user"
		+ "(user_id,name,last_name,second_last_name,email,password,birth_date,"
		+ "start_date,is_student,is_professor,is_admin) values "
		+ "(?,?,?,?,?,?,?,?,?,?,?)";

	private static final String student_insert_sql =
		"insert into student" + " (user_id,active) values (?,?)";

	private static final String career_plan_student_insert = "insert into "
		+ "career_plan_student(career_plan_student_id,career_plan_id,user_id)"
		+ " values(?,?,?)";

	/*
	 * See the original documentation of the method declaration
	 * @see com.raven.people.dao.StudentDAO#createStudent(com.raven.people.model.Student)
	 */
	@Override
	public void createStudent(Student student) {
		Long studentId;
		int result;
		boolean isStudent = false, isProfessor = false, isAdmin = false;
		studentId = getNextId(user_seq);

		for (UserRol rol : student.getUserRols()) {
			if (rol == UserRol.STUDENT) {
				isStudent = true;
			}
			if (rol == UserRol.PROFESSOR) {
				isProfessor = true;
			}
			if (rol == UserRol.ADMIN) {
				isAdmin = true;
			}
		}

		result = getJdbcTemplate().update(user_insert_sql, studentId, student.getName(),
			student.getLastName(), student.getSecondLastName(), student.getEmail(),
			student.getPassword(), student.getBirthDate(), student.getStartDate(), isStudent,
			isProfessor, isAdmin);
		checkRowUpdated(1, result);

		result =
			getJdbcTemplate().update(student_insert_sql, studentId, student.isActive());
		checkRowUpdated(1, result);
		student.setId(studentId);

		// create student career plans
		student.getStudentCareerPlans().forEach(careerPlanId -> {
			Long careerPlanStudentId;
			int result2;
			careerPlanStudentId = getNextId(career_plan_student_seq);
			result2 = getJdbcTemplate().update(career_plan_student_insert,
				careerPlanStudentId, careerPlanId, studentId);
			checkRowUpdated(1, result2);
		});
	}
}
