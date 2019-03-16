/**
 * CareerPlanJdbcDAO.java
 * Creation Date: 07/07/2018, 17:48:29
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

import com.raven.course.dao.CareerPlanDAO;
import com.raven.course.model.CareerPlan;
import com.raven.course.model.CourseCareerPlan;

/**
 * CareerPlanDAO JDBC implementation
 */

@Repository("careerPlanDAO")
public class CareerPlanJdbcDAO extends GenericJdbcDAO implements CareerPlanDAO {

  private static final String career_plan_seq = "career_plan_seq";

  private static final String course_career_plan_seq = "course_career_plan_seq";

  private static final String career_plan_insert = "insert into career_plan("
    + "career_plan_id,name,description,adquired_ack) values(?,?,?,?)";

  private static final String course_career_plan_insert = "insert into "
    + "course_career_plan(course_career_plan_id,order_course,career_plan_id,course_id)"
    + " values(?,?,?,?)";

  /*
   * See the original documentation of the method declaration
   * @see com.raven.course.dao.CareerPlanDAO#create(com.raven.course.model.CareerPlan)
   */
  @Override
  public void create(CareerPlan plan) {

    Long id;
    int result;

    id = getNextId(career_plan_seq);
    result = getJdbcTemplate().update(career_plan_insert, id, plan.getName(),
      plan.getDescription(), plan.getAdquiredAck());
    checkRowUpdated(1, result);
    plan.setId(id);
  }

  /*
   * See the original documentation of the method declaration
   * @see com.raven.course.dao.CareerPlanDAO#addCourseToPlan(com.raven.course.model.
   * CourseCareerPlan)
   */
  @Override
  public void addCourseToPlan(CourseCareerPlan courseCareerPlan) {

    Long id;
    int result;

    id = getNextId(course_career_plan_seq);
    result =
      getJdbcTemplate().update(course_career_plan_insert, id, courseCareerPlan.getOrder(),
        courseCareerPlan.getPlan().getId(), courseCareerPlan.getCourse().getId());
    checkRowUpdated(1, result);
    courseCareerPlan.setId(id);
  }
}
