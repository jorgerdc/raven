/**
 * StudentServiceImpl.java
 * Creation Date: 15/07/2018, 20:01:11
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

package com.raven.people.service.impl;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.raven.people.dao.StudentDAO;
import com.raven.people.model.Student;
import com.raven.people.model.UserRol;
import com.raven.people.service.StudentService;

/**
 * Student DAO business Service implementation
 */

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentDAO studentDAO;

	private static final Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

	/*
	 * See the original documentation of the method declaration
	 * @see com.raven.people.service.StudentService#createStudent(com.raven.people.model.
	 * Student)
	 */
	@Override
	public void createStudent(Student student) {
		log.debug("Creating new student");
		if (!student.getUserRols().contains(UserRol.STUDENT)) {
			throw new IllegalArgumentException(
				"Student rol was not set in object " + student);
		}
		studentDAO.createStudent(student);
	}

	/*
	 * See the original documentation of the method declaration
	 * @see com.raven.people.service.StudentService#createStudent(java.lang.String)
	 */
	@Override
	public void createStudent(String email) {
		Student student;
		Set<UserRol> rols;

		log.debug("creating student using email {}", email);
		student = new Student();
		rols = new HashSet<>(5);
		rols.add(UserRol.STUDENT);
		student.setUserRols(rols);
		student.setEmail(email);
		studentDAO.createStudent(student);
	}

}
