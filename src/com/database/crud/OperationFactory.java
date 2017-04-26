package com.database.crud;

import java.sql.SQLException;

public class OperationFactory {

	public static Operation execute(OperationType operation) throws SQLException{
		
		switch(operation){
		
		case INSERT :
			return new InsertValues();
			
		case SELECT :
			return new Read();
			
		case UPDATE:
			return new Update();
			
		default:
			return null;
		}
		
	}
	
}
