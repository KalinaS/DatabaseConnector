package com.database.result;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import com.database.connection.DBType;

public class InsertResult extends Result{
		
	private boolean flag;
	private int numInsertOperations;
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public int getNumInsertOperations() {
		return numInsertOperations;
	}
	public void setNumInsertOperations(int numInsertOperations) {
		this.numInsertOperations = numInsertOperations;
	}
		
}