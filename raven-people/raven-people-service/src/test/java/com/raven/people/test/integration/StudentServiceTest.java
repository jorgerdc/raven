/**
 * StudentServiceTest.java
 * Creation Date: 15/07/2018, 21:48:29
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

package com.raven.people.test.integration;

import static io.github.benas.randombeans.EnhancedRandomBuilder.aNewEnhancedRandomBuilder;
import static io.github.benas.randombeans.FieldDefinitionBuilder.field;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.raven.people.Application;
import com.raven.people.model.Student;
import com.raven.people.service.StudentService;

import io.github.benas.randombeans.FieldDefinitionBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import io.github.benas.randombeans.api.Randomizer;

/**
 * Student service integration tests
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class })
@ActiveProfiles("dev")
public class StudentServiceTest {

	@Resource
	private StudentService studentService;

	private EnhancedRandom random;

	private static final Logger log = LoggerFactory.getLogger(StudentServiceTest.class);

	/**
	 * Create a new random
	 */
	@Before
	public void setup() {

		random = aNewEnhancedRandomBuilder().stringLengthRange(5, 10)
			.exclude(field().named("id").get())
			.randomize(FieldDefinitionBuilder.field().named("studentCareerPlans")
				.ofType(Set.class).inClass(Student.class).get(),
				new CareerPlanIdsRandomizer())
			.build();

	}

	/**
	 * creates a new Student.
	 */
	@Test

	public void createStudent() {
		Student student;
		student = random.nextObject(Student.class);
		studentService.createStudent(student);
		assertNotNull(student.getId());
		log.debug("student created: {}", student);

	}

	private static class CareerPlanIdsRandomizer implements Randomizer<Set<Long>> {

		private Random random = new Random();

		/*
		 * See the original documentation of the method declaration
		 * @see io.github.benas.randombeans.api.Randomizer#getRandomValue()
		 */
		@Override
		public Set<Long> getRandomValue() {
			Set<Long> set = new HashSet<>();
			for (int i = 0; i < 5; i++) {
				set.add(new Long(random.nextInt(Integer.MAX_VALUE)));
			}
			return set;
		}

	}

}
