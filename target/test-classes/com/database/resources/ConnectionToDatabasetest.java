package com.database.resources;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	PreparedStatement pstmt = null;

	int affectedRows;

	@Before
	public void beforeTest() throws SQLException {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/file_management", "root", "database");
			stmt = conn.createStatement();

		} catch (ClassNotFoundException cnf) {
			log.error(cnf.getMessage());
		} finally {

		}

	}

/*	@Test
	public void testInsert() throws SQLException {

		String sql = "Insert into File(parentID, name, directory, extension, addingDate) values (:parentID, :name, :directory, :extension, :addingDate)";

		parameters.put(":parentId", 6);
		parameters.put(":name", "file");
		parameters.put(":directory", "file/file");
		parameters.put(":extension", "ppt");
		parameters.put(":addingDate", "curvalue()");

		for (Map.Entry<String, Object> p : parameters.entrySet()) {

			sql = sql.replaceAll(p.getKey(), p.getValue().toString());
		}

		// affectedRows = stmt.executeUpdate("Insert into File(parentID, name, directory, extension, addingDate) + values (5, 'name', 'directory/directory', 'txt', curdate())");
		pstmt = conn.prepareStatement(sql);
		assertNotNull(affectedRows);
		log.debug("Rows affected after insert operation: " + affectedRows);
		assertNotNull(pstmt);
	}*/

	/*
	 * @Test public void testSelect() throws SQLException{
	 * 
	 * String sql = "Select * from file where extension = :extension";
	 * parameters.put(":extension", "ppt");
	 * 
	 * for(Map.Entry<String, Object> p : parameters.entrySet()){
	 * 
	 * sql = sql.replace(p.getKey(), p.getValue().toString()); }
	 * 
	 * 
	 * pstmt = conn.prepareStatement(sql);
	 * 
	 * while(rs.next()){ rs = pstmt.executeQuery();
	 * log.debug(rs.getInt(rs.getString(":extension")));
	 * assertNotNull(rs.getString(":extension")); } }
	 */

	/*
	 * @Test public void testDelete() throws SQLException{
	 * 
	 * affectedRows = stmt.executeUpdate("Delete from file where fileID=1");
	 * log.debug("Rows affected after delete operation: " + affectedRows);
	 * assertNotEquals(0,affectedRows);
	 * 
	 * }
	 */

	@Test
	public void testUpdate() throws SQLException {

		String sql = "Update file set extension = :extension where fileID = :fileID";

		parameters.put(":extension", "kkk");
		parameters.put("fileID", 8);

		for (Map.Entry<String, Object> p : parameters.entrySet()) {

			sql = sql.replaceAll(p.getKey(), p.getValue().toString());
		}

		pstmt = conn.prepareStatement(sql);
		/*
		 * stmt.executeUpdate("Update file set extension='ttt' where fileID=8");
		 * log.debug("Rows affected after delete operation: " + affectedRows);
		 */
		assertNotEquals(0, affectedRows);
	}

	@After
	public void afterTest() throws SQLException {

		if (rs != null) {
			rs.close();
		}

		if (stmt != null) {
			stmt.close();
		}

		if (conn != null) {
			conn.close();
		}

	}

}
