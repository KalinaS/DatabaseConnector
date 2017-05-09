//package com.database.connection;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import org.apache.log4j.Logger;
//
//public class DBConnection {
//
//	Logger log = Logger.getLogger(DBConnection.class);
//
//	protected Connection connection;
//	protected Statement statement;
//	protected ResultSet resSet;
//
//	public DBConnection(){
//
//		try {
//
//			Class.forName("com.mysql.jdbc.Driver");
//			CreateConnection createConection = ConnectionFactory.getConnection(DBType.MYSQLDB);
////			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "database");
//			connection = createConection.getConnection();
//			statement = createConection.getStatement();
//		
//
//		} catch (SQLException sqle) {
//			
//			sqle.printStackTrace();
//		} catch (ClassNotFoundException cnfe){
//			cnfe.printStackTrace();
//		} catch(IOException ioe){
//			ioe.getMessage();
//		}finally {
//
//			if (resSet != null) {
//				try {
//					resSet.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//
//
//		}
//
//	}
//	
//	public Connection getConnection(){
//		
//		return connection;
//	}
//
//}