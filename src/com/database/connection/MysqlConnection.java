package com.database.connection;

import java.io.IOException;
import java.sql.*;
import com.database.crud.InsertValues;
import com.database.crud.Read;
import com.database.util.PropertyUtil;

public class MysqlConnection implements CreateConnection{
	
	private static Connection connection;
	private static Statement statement;
	
	private String url;
	private String user;
	private String password;
	
	MysqlConnection() throws IOException, SQLException{
		
		this.url = PropertyUtil.getValue("mysqlUrl");
		this.user = PropertyUtil.getValue("mysqlUser");
		this.password = PropertyUtil.getValue("mysqlPass");	
		
		statement = connection.createStatement();
	}


	public Connection getConnection() throws SQLException, IOException {
		
		return DriverManager.getConnection(url, user, password);
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
