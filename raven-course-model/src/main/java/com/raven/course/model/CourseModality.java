/**
 * CourseModality.java
 * Creation Date: 06/07/2018, 22:33:07
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

package com.raven.course.model;

/**
 * CourseModality static catalog.
 */

public enum CourseModality {

  /**
   * On Site course
   */
  ON_SITE(1, "ON SITE", "The course is taught in a classroom. Students and teacher meet"
    + " in a specific place", true),

  /**
   * Online course
   */
  ONLINE(2, "ONLINE",
    "The course is taught online, students and teacher join using an online platform.",
    true);

  private Integer id;

  private String name;

  private String description;

  private boolean active;

  /**
   * private constructor
   * @param id
   * @param name
   * @param description
   * @param active
   */
  private CourseModality(Integer id, String name, String description, boolean active) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.active = active;
  }

  /**
   * @return the id
   */
  public Integer getId() {
    return id;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @return the active
   */
  public boolean isActive() {
    return active;
  }

}
