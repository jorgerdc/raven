/**
 * Course.java
 * Creation Date: 06/07/2018, 22:28:38
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
import java.net.URL;
import java.util.Set;

/**
 * Course model class
 */

public class Course implements Serializable {

	private static final long serialVersionUID = 1410945950533182259L;

	private Long id;

	private String name;

	private String description;

	private String adquiredAck;

	private int totalHours;

	private byte[] logo;

	private URL landingPage;

	private CourseStatus status;

	private CourseTopic rootTopic;

	private Set<CourseModality> modalities;

	private Set<CourseResource> resources;

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

	/**
	 * @return the totalHours
	 */
	public int getTotalHours() {
		return totalHours;
	}

	/**
	 * @param totalHours the totalHours to set
	 */
	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}

	/**
	 * @return the logo
	 */
	public byte[] getLogo() {
		return logo;
	}

	/**
	 * @param logo the logo to set
	 */
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	/**
	 * @return the landingPage
	 */
	public URL getLandingPage() {
		return landingPage;
	}

	/**
	 * @param landingPage the landingPage to set
	 */
	public void setLandingPage(URL landingPage) {
		this.landingPage = landingPage;
	}

	/**
	 * @return the status
	 */
	public CourseStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(CourseStatus status) {
		this.status = status;
	}

	/**
	 * @return the rootTopic
	 */
	public CourseTopic getRootTopic() {
		return rootTopic;
	}

	/**
	 * @param rootTopic the rootTopic to set
	 */
	public void setRootTopic(CourseTopic rootTopic) {
		this.rootTopic = rootTopic;
	}

	/**
	 * @return the modalities
	 */
	public Set<CourseModality> getModalities() {
		return modalities;
	}

	/**
	 * @param modalities the modalities to set
	 */
	public void setModalities(Set<CourseModality> modalities) {
		this.modalities = modalities;
	}

	/**
	 * @return the resources
	 */
	public Set<CourseResource> getResources() {
		return resources;
	}

	/**
	 * @param resources the resources to set
	 */
	public void setResources(Set<CourseResource> resources) {
		this.resources = resources;
	}

	/*
	 * See the original documentation of the method declaration
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Course [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", adquiredAck=");
		builder.append(adquiredAck);
		builder.append(", totalHours=");
		builder.append(totalHours);
		if (logo != null) {
			builder.append(", logo length (bytes) =");
			builder.append(logo.length);
		}
		builder.append(", landingPage=");
		builder.append(landingPage);
		builder.append(", status=");
		builder.append(status);
		builder.append(", rootTopic=");
		builder.append(rootTopic);
		builder.append(", modalities=");
		builder.append(modalities);
		if (resources != null) {
			builder.append(", resources (size)=");
			builder.append(resources.size());
		}
		builder.append("]");
		return builder.toString();
	}

}
