package com.database.resources;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.database.connection.DBConnection;
import com.database.resources.PropertyUtil;

/**
 * 
 * @author k.stoyanova
 *
 */

public class PropertiesUtilTest {

	@Test
	public void isPropertyFileEmpty() {

		assertFalse("File is not empty", PropertyUtil.isProperiesLoaded());

	}

	@Test
	public void testPropertyLoaded() throws IOException {

		PropertyUtil.loadPropertyFile();
		assertTrue(PropertyUtil.isProperiesLoaded());

	}

	@Test
	public void testPropertyValue() throws IOException {

		assertEquals("root", PropertyUtil.getValue("mysqlUser"));
		assertEquals("database", PropertyUtil.getValue("mysqlPass"));
		assertEquals("jdbc:mysql://localhost:3306/world", PropertyUtil.getValue("mysqlUrl"));
	}
	
	@Test
	public void testConnection() throws IOException, SQLException{
		DBUtilities.getConnection(DBType.MYSQLDB);
		assertTrue();
	}
	
/*
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testIOException() throws IOException {

		thrown.expect(IOException.class);
		PropertyUtil.setPrperty("kalina");
		PropertyUtil.loadPropertyFile();
		

	}
*/
}
