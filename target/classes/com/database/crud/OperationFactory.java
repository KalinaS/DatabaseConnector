package com.database.crud;

import java.io.IOException;
import java.sql.SQLException;

import com.database.connection.DBType;

public class OperationFactory {

	public static Operation create(OperationType operation, DBType dbType) throws SQLException, ClassNotFoundException, IOException{
		
		switch(operation){
		
		case INSERT :
			return new InsertOperation(operation, dbType);
			
		case SELECT :
			return new ReadOperation(operation, dbType);
			
		case UPDATE:
			return new UpdateOperation(operation, dbType);
			
		default:
			return null;
		}
		
	}
	
}
