/**
 * CareerPlan.java
 * Creation Date: 06/07/2018, 22:31:37
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

import java.io.Serializable;

/**
 * CareerPlan model class
 */

public class CareerPlan implements Serializable {

  private static final long serialVersionUID = -8490389380760478658L;

  private Long id;

  private String name;

  private String description;

  private String adquiredAck;

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * @return the adquiredAck
   */
  public String getAdquiredAck() {
    return adquiredAck;
  }

  /**
   * @param adquiredAck the adquiredAck to set
   */
  public void setAdquiredAck(String adquiredAck) {
    this.adquiredAck = adquiredAck;
  }

  /*
   * See the original documentation of the method declaration
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("CareerPlan [id=");
    builder.append(id);
    builder.append(", name=");
    builder.append(name);
    builder.append(", description=");
    builder.append(description);
    builder.append(", adquiredAck=");
    builder.append(adquiredAck);
    builder.append("]");
    return builder.toString();
  }

}
