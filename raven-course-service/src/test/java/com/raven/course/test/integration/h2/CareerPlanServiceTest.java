/**
 * CareerPlanServiceTest.java
 * Creation Date: 07/07/2018, 13:20:04
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

package com.raven.course.test.integration.h2;

import static io.github.benas.randombeans.EnhancedRandomBuilder.aNewEnhancedRandomBuilder;
import static io.github.benas.randombeans.FieldDefinitionBuilder.field;
import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.raven.course.model.CareerPlan;
import com.raven.course.service.CareerPlanService;

import io.github.benas.randombeans.api.EnhancedRandom;

/**
 * Integration test used to validate the Course service implementation.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration({ "/ravenCourseServiceContext.xml", "/ravenCourseDaoContext.xml" })
@ActiveProfiles(resolver = RavenActiveProfilesResolver.class)
// test data will be rolled back after the test execution to keep a clean database.
@Transactional
public class CareerPlanServiceTest {

  private static Logger log = LoggerFactory.getLogger(CareerPlanServiceTest.class);

  @Resource
  private CareerPlanService careerPlanService;

  private EnhancedRandom random;

  /**
   * Create a new random
   */
  @Before
  public void setup() {

    random = aNewEnhancedRandomBuilder().stringLengthRange(5, 40)
      .exclude(field().named("id").get()).build();

  }

  /**
   * Creates a new course, just to see if the service and dao are working property
   */
  @Test
  public void createNewCareerPlan() {

    CareerPlan plan;
    plan = random.nextObject(CareerPlan.class);
    log.debug("creating plan {}", plan);
    careerPlanService.createPlan(plan);
    assertNotNull("id was not set by DAO", plan.getId());
    log.debug("plan created: {}", plan);

  }
}
