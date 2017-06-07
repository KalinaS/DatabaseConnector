package com.database.result;

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