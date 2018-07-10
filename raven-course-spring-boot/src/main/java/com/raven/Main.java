/**
 * Main.java
 * Creation Date: 08/07/2018, 23:54:55
 *
 * Copyright (C) The Project *raven-course-spring-boot* Authors.
 *
 * This software was created for didactic and academic purposes.
 * It can be used and even modified by referring to the author
 * or project on GitHub. If the file is modified, add a note
 * after this paragraph saying that this file is a modified version.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package com.raven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main class for raven application
 */
@RestController
@EnableAutoConfiguration
public class Main {

	/**
	 * @return
	 */
	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
