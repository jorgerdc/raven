/**
 * CourseResourceJdbcDAO.java
 * Creation Date: 07/07/2018, 18:31:54
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

import org.springframework.stereotype.Repository;

import com.raven.course.dao.CourseResourceDAO;
import com.raven.course.model.CourseResource;

/**
 * Course Resource data access object implementation
 */
@Repository("courseResourceDAO")
public class CourseResourceJdbcDAO extends GenericJdbcDAO implements CourseResourceDAO {

  private static final String course_resource_seq = "course_resource_seq";

  private static final String resources_insert_sql = "insert into course_resource"
    + "(course_resource_id,name,description,url,is_private,course_id) values "
    + "(?,?,?,?,?,?)";

  /*
   * See the original documentation of the method declaration
   * @see com.raven.course.dao.CourseResourceDAO#addResources(java.util.Set,
   * java.lang.Long)
   */
  @Override
  public void addResources(Set<CourseResource> resources, Long courseId) {

    resources.forEach(resource -> {
      Long id;
      int result;
      id = getNextId(course_resource_seq);
      result = getJdbcTemplate().update(resources_insert_sql, id, resource.getName(),
        resource.getDescription(), resource.getUrl(), resource.getIsPrivate(), courseId);
      checkRowUpdated(1, result);
      resource.setId(id);
    });
  }
}
