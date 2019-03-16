/**
 * TopicCourseDAO.java
 * Creation Date: 07/07/2018, 00:07:33
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

package com.raven.course.dao;

import com.raven.course.model.CourseTopic;

/**
 * Topic Course Data Access Object
 */

public interface TopicCourseDAO {

  /**
   * Creates the topic tree of a course.
   * @param rootTopic
   */
  void createTopicTree(CourseTopic rootTopic);

}
