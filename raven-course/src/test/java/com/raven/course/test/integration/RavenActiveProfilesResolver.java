/**
 * RavenActiveProfilesResolver.java
 * Creation Date: 07/07/2018, 13:40:39
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

package com.raven.course.test.integration;

import java.io.File;
import java.io.IOException;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ActiveProfilesResolver;

/**
 * This class is used to decide which profile will be activated for testing. The rules and
 * the number of profiles are project specific. In this case there are 3 profiles that
 * where designed mainly to show how the spring handles this mechanism. These profiles can
 * be activated in the following order:<br>
 * <br>
 * 1. Check if an H2 server is running by creating a Socket. If the connection is
 * successful, the profile "h2-server" is activated.<br>
 * <br>
 * 2. If not H2 server is running, check if the database files exist under
 * src/test/resources/databases/h2/schemas. If the files exist, "h2-no-server" profile is
 * activated.<br>
 * <br>
 * 3.Finally if no database files are found, "h2-embedded" profile will be activated
 * which will be used to create a new database for every test run.
 */

public class RavenActiveProfilesResolver implements ActiveProfilesResolver {

	private static final Logger log =
		LoggerFactory.getLogger(RavenActiveProfilesResolver.class);

	/*
	 * See the original documentation of the method declaration
	 * @see
	 * org.springframework.test.context.ActiveProfilesResolver#resolve(java.lang.Class)
	 */
	@Override
	public String[] resolve(Class<?> testClass) {

		boolean available;
		File file;

		log.debug("Checking if an H2 server is running locally");
		available = isServiceAvailable("localhost", 9092);
		if (available) {
			log.debug("H2 server running, using 'h2' profile");
			return new String[] { "h2-server" };
		}

		log.debug("No local server is running, checking if db files exist");
		file = new File("src/test/resources/databases/h2/schemas/raven-course.mv.db");
		if (file.exists()) {
			log.debug("Database files were found, h2-no-server profile will be used ");
			return new String[] { "h2-no-server" };
		}

		log.debug(
			"No servers running, no database files, h2-embedded profile will be used");
		return new String[] { "h2-embedded" };

	}

	/**
	 * @param ip
	 * @param port
	 * @return
	 */
	private boolean isServiceAvailable(String ip, int port) {
		try (Socket ignored = new Socket(ip, port)) {
			return true;
		} catch (IOException ignored) {
			return false;
		}
	}

}
