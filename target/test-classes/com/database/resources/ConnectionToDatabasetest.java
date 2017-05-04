package com.database.resources;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.database.connection.DBConnection;

public class ConnectionToDatabasetest {
	
	Logger log = Logger.getLogger(DBConnection.class);
	
	Map<String, Object> parameters = new HashMap();

	Connection conn = null;
	Statement stmt = null;
	
	int affectedRows;
	
	@Before
	public void beforeTest() throws SQLException{
				
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/file_management", "root", "database");
			stmt = conn.createStatement();
			
		} catch(ClassNotFoundException cnf){
			log.error(cnf.getMessage());
		}finally {
			
		}
		
	}
	
/*	@Test
	public void testInsert() throws SQLException{
		
		int result = 0;
		result = stmt.executeUpdate("Insert into File(parentID, name, directory, extension, addingDate) values (4, 'test', 'test/test', 'pdf', curdate())");
		assertNotNull(result);
		log.debug(result);
	}*/
	
	@Test
	public void testSelect() throws SQLException{

		stmt.executeQuery("Select * from file where extension='pdf'");
		
		
	}
	
	@Test
	public void testDelete() throws SQLException{
		
		affectedRows = stmt.executeUpdate("Delete from file where fileID between 15 and 16");
		log.debug(affectedRows);
		assertNull(affectedRows);
		
			
	}
	
/*	@Test
	public void testUpdate() throws SQLException{
		stmt.executeUpdate("Update file set extension='ppt' where fileID=8");
	}*/
	
	@After
	public void afterTest() throws SQLException{
		
		if(conn != null){
			conn.close();
		}
		
		if(stmt != null){
			stmt.close();
		}
		
	}
	
}
