package com.database.crud;

import java.sql.*;
import java.util.Map;

public class InsertOperation extends Operation implements SqlQuery{

	public void executeInsert() throws SQLException{
			
			MapValue.insert(1, 0, "Task", "C:/Users/k.stoyanova/Desktop", null);
			doOperation(INSERT, MapValue.parameters);
				
			MapValue.insert(2, 1, "Kalina", "C:/Users/k.stoyanova/Desktop/Task", null);
			doOperation(INSERT, MapValue.parameters);
			
			MapValue.insert(3, 2, "JavaIntro", "C:/Users/k.stoyanova/Desktop/Task/Kalina", null);
			doOperation(INSERT, MapValue.parameters);
			
			MapValue.insert(4, 2, "JavaTask", "C:/Users/k.stoyanova/Desktop/Task/Kalina", null);
			doOperation(INSERT, MapValue.parameters);
			
			MapValue.insert(5, 3, "Introduction-to-Programing-with-Java-Book-v2014", "C:/Users/k.stoyanova/Desktop/Task/Kalina/JavaIntro", "pdf");
			doOperation(INSERT, MapValue.parameters);
			
			MapValue.insert(6, 3, "FolderScanner", "C:/Users/k.stoyanova/Desktop/Task/Kalina/JavaTask", "txt");
			doOperation(INSERT, MapValue.parameters);
	}
	
}
