/**
 * AdminService.java
 * Creation Date: 15/07/2018, 18:48:59
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

package com.raven.people.service;

import com.raven.people.model.Admin;

/**
 * System administrator business service
 */

public interface AdminService {

	/**
	 * Create an admin
	 * @param admin
	 */
	void createAdmin(Admin admin);

	/**
	 * Get admin by id. If the user does not exist, {@link RuntimeException} is thrown
	 * @param id
	 * @return
	 */
	Admin getAdminById(Long id);

}
