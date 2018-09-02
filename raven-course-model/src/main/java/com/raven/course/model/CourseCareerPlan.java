/**
 * CourseCareerPlan.java
 * Creation Date: 06/07/2018, 22:32:33
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
 * CourseCareerPlan model class
 */

public class CourseCareerPlan implements Serializable {

	private static final long serialVersionUID = 3053543961876402873L;

	private Long id;

	private int order;

	private Course course;

	private CareerPlan plan;

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
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(int order) {
		this.order = order;
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	/**
	 * @return the plan
	 */
	public CareerPlan getPlan() {
		return plan;
	}

	/**
	 * @param plan the plan to set
	 */
	public void setPlan(CareerPlan plan) {
		this.plan = plan;
	}

	/*
	 * See the original documentation of the method declaration
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CourseCareerPlan [id=");
		builder.append(id);
		builder.append(", order=");
		builder.append(order);
		builder.append(", course=");
		builder.append(course);
		builder.append(", plan=");
		builder.append(plan);
		builder.append("]");
		return builder.toString();
	}

}
