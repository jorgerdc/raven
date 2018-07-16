/**
 * AboutUser.java
 * Creation Date: 15/07/2018, 16:57:43
 *
 * Copyright (C) The Project *raven-people-model* Authors.
 *
 * This software was created for didactic and academic purposes.
 * It can be used and even modified by referring to the author
 * or project on GitHub. If the file is modified, add a note
 * after this paragraph saying that this file is a modified version.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package com.raven.people.model;

import java.io.Serializable;
import java.net.URL;

/**
 * AboutUser model class. Every instance contains some social media info related with
 * the Student.
 */

public class AboutUser implements Serializable {

	private static final long serialVersionUID = -7521827783207563337L;

	private Long id;

	private SocialMedia socialMedia;

	private URL url;

	private String otherSocialMediaName;

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
	 * @return the socialMedia
	 */
	public SocialMedia getSocialMedia() {
		return socialMedia;
	}

	/**
	 * @param socialMedia the socialMedia to set
	 */
	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}

	/**
	 * @return the url
	 */
	public URL getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(URL url) {
		this.url = url;
	}

	/**
	 * @return the otherSocialMediaName
	 */
	public String getOtherSocialMediaName() {
		return otherSocialMediaName;
	}

	/**
	 * @param otherSocialMediaName the otherSocialMediaName to set
	 */
	public void setOtherSocialMediaName(String otherSocialMediaName) {
		this.otherSocialMediaName = otherSocialMediaName;
	}

	/*
	 * See the original documentation of the method declaration
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AboutUser [id=");
		builder.append(id);
		builder.append(", socialMedia=");
		builder.append(socialMedia);
		builder.append(", url=");
		builder.append(url);
		builder.append(", otherSocialMediaName=");
		builder.append(otherSocialMediaName);
		builder.append("]");
		return builder.toString();
	}

}
