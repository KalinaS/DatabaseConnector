package com.database.crud;

import java.io.IOException;
import java.sql.SQLException;

public class OperationFactory {

	public static Operation execute(OperationType operation) throws SQLException, ClassNotFoundException, IOException{
		
		switch(operation){
		
		case INSERT :
			return new InsertOperation();
			
		case SELECT :
			return new ReadOperation();
			
		case UPDATE:
			return new UpdateOperation();
			
		default:
			return null;
		}
		
	}
	
}
