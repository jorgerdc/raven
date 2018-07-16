/**
 * GenericJdbcDAO.java
 * Creation Date: 07/07/2018, 11:43:05
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

package com.raven.people.dao.jdbc;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Utility base class to initialize a JDBC DAO with a dataSource All DAO implementation
 * should extend this class.
 */

public abstract class GenericJdbcDAO extends JdbcDaoSupport {

	private static final String nextval_sql = "select nextval(?)";

	@Resource(name = "dataSource")
	private void setDS(DataSource ds) {
		this.setDataSource(ds);
	}

	/**
	 * Check the results of a insert,update or delete operation
	 * @param expected
	 * @param actual
	 */
	protected final void checkRowUpdated(int expected, int actual) {

		if (expected != actual) {

			throw new IncorrectResultSizeDataAccessException(expected, actual);
		}

	}

	/**
	 * get a new Id using a sequence
	 * @param seqName
	 * @return
	 */
	protected final Long getNextId(String seqName) {

		return getJdbcTemplate().queryForObject(nextval_sql, Long.class, seqName);
	}

}
