/**
 * SocialMedia.java
 * Creation Date: 15/07/2018, 17:00:01
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

/**
 * Social Media static catalog.
 */

public enum SocialMedia {

	/**
	 * 1 - Facebook
	 */
	FACEBOOK(1, "Facebook", "Facebook", true),

	/**
	 * 2 - Linked In
	 */
	LINKEDIN(2, "Linked In", "Linked In", true),

	/**
	 * 3 - Twitter
	 */
	TWITTER(3, "Twitter", "Twitter", true),

	/**
	 * 4 - Blog
	 */
	BLOG(4, "Personal Blog", "Personal Blog", true),

	/**
	 * 5 - YouTube
	 */
	YOU_TUBE(5, "YouTube Channel", "YouTube channel", true),

	/**
	 * 6 - Personal site
	 */
	PERSONAL_SITE(6, "Personal site", "Personal site", true),

	/**
	 * 7 - Other
	 */
	OTHER(7, "Other", "Other social media site", true);

	private Integer id;

	private String name;

	private String description;

	private boolean active;

	/**
	 * Constructor
	 * @param id
	 * @param name
	 * @param description
	 * @param active
	 */
	private SocialMedia(Integer id, String name, String description, boolean active) {
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
