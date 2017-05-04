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
	ResultSet rs = null;
	
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
	
	/*@Test
	public void testInsert() throws SQLException{
		
		affectedRows = stmt.executeUpdate("Insert into File(parentID, name, directory, extension, addingDate) values (5, 'name', 'directory/directory', 'txt', curdate())");
		assertNotNull(affectedRows);
		log.debug("Rows affected after insert operation: " + affectedRows);
		assertNotEquals(0, affectedRows);
	}*/
	
	@Test
	public void testSelect() throws SQLException{
		
		rs = stmt.executeQuery("Select * from file where extension='pdf'");
		while(rs.next()){
			log.debug(rs.getInt("fileID") + " " + rs.getString("extension"));
			assertNotNull(rs.getString("extension"));
		}
	}
	
	/*@Test
	public void testDelete() throws SQLException{
		
		affectedRows = stmt.executeUpdate("Delete from file where fileID=1");
		log.debug("Rows affected after delete operation: " + affectedRows);
		assertNotEquals(0,affectedRows);
			
	}*/
	
	/*@Test
	public void testUpdate() throws SQLException{
		stmt.executeUpdate("Update file set extension='ttt' where fileID=8");
		log.debug("Rows affected after delete operation: " + affectedRows);
		assertNotEquals(0,affectedRows);
	}*/
	
	@After
	public void afterTest() throws SQLException{
		
		if(rs != null){
			rs.close();
		}
		
		if(stmt != null){
			stmt.close();
		}
		
		if(conn != null){
			conn.close();
		}
		
		
		
	}
	
}
