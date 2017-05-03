package com.database.connection;

import java.io.IOException;
import java.sql.*;
import com.database.crud.InsertOperation;
import com.database.crud.ReadOperation;
import com.database.util.PropertyUtil;

public class MysqlConnection implements CreateConnection{
	
	private static Statement statement;
//	private static DBConnection dbc = new DBConnection();
	private static Connection connection;
	
	private String url;
	private String user;
	private String password;
	
	public MysqlConnection(){
		try {
			this.url = PropertyUtil.getValue("mysqlUrl");
			this.user = PropertyUtil.getValue("mysqlUser");
			this.password = PropertyUtil.getValue("mysqlPass");	
			
			connection = DriverManager.getConnection(url, user, password);
				
			statement = connection.createStatement();
		} catch (SQLException sqle) {
			
			sqle.printStackTrace();
		} catch (IOException ioe){
			ioe.printStackTrace();
		} 
	}


	public Connection getConnection() throws SQLException, IOException {
		
//		return DriverManager.getConnection(url, user, password);
		return connection;
	}
	
	public Statement getStatement() throws SQLException, IOException {
		
//		return DriverManager.getConnection(url, user, password);
		return statement;
	}



	/*public void insertValues() throws SQLException{
		
		statement.executeUpdate("insert into File(fileID, parentID, name, directory, extension)"
				+ "values(1, NULL, 'Task', 'C:/Users/k.stoyanova/Desktop', NULL)");
		statement.executeUpdate("insert into File(fileID, parentID, name, directory, extension)"
				+ "values(2, 1, 'Kalina', 'C:/Users/k.stoyanova/Desktop/Task', NULL)");
		statement.executeUpdate("insert into File(fileID, parentID, name, directory, extension)"
				+ "values(3, 2, 'JavaIntro', 'C:/Users/k.stoyanova/Desktop/Task/Kalina', NULL)");
		statement.executeUpdate("insert into File(fileID, parentID, name, directory, extension)"
				+ "values(4, 2, 'JavaTask', 'C:/Users/k.stoyanova/Desktop/Task/Kalina', NULL)");
		statement.executeUpdate("insert into File(fileID, parentID, name, directory, extension)"
				+ "values(5, 3, 'Introduction-to-Programing-with-Java-Book-v2014', 'C:/Users/k.stoyanova/Desktop/Task/Kalina/JavaIntro', 'pdf')");
		statement.executeUpdate("insert into File(fileID, parentID, name, directory, extension)"
				+ "values(6, 3, 'FolderScanner', 'C:/Users/k.stoyanova/Desktop/Task/Kalina/JavaTask', 'txt')");
	}


	public void select() {
		
		
		
	}*/

}
