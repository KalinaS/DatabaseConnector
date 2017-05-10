package com.database.resources;

import org.junit.*;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;

import com.database.connection.ConnectionFactory;
import com.database.connection.DBType;
import com.database.util.PropertyUtil;

/**
 * 
 * @author k.stoyanova
 *
 */

public class PropertiesUtilTest {

	@Test
	public void isPropertyFileEmpty() {

		assertTrue(PropertyUtil.isProperiesLoaded());

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
		assertEquals("jdbc:mysql://localhost:3306/sakila", PropertyUtil.getValue("mysqlUrl"));
	}
	
	@Test
	public void testConnection() throws IOException, SQLException{
		
		assertNotNull(ConnectionFactory.getConnection(DBType.MYSQLDB));
	}

	

/*	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testIOException() throws IOException {

		thrown.expect(IOException.class);
		PropertyUtil.setPrperty("kalina");
		PropertyUtil.loadPropertyFile();
		

	}*/

}
