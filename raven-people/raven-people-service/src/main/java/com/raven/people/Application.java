/**
 * Application.java
 * Creation Date: 15/07/2018, 22:12:01
 *
 * Copyright (C) The Project *raven-people-service* Authors.
 *
 * This software was created for didactic and academic purposes.
 * It can be used and even modified by referring to the author
 * or project on GitHub. If the file is modified, add a note
 * after this paragraph saying that this file is a modified version.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package com.raven.people;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring boot application class
 */
@SpringBootApplication
public class Application {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
}