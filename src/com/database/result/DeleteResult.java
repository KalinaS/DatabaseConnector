package com.database.result;

public class DeleteResult extends Result{

	private boolean flag;
	private int numDeleteOperations;
	
	public void setFlag(boolean flag){
		
		this.flag = flag;
		
	}
	
	public boolean getFlag(){
		
		return flag;
	}
	
	public void setDeleteOperations(int numOperations){
		
		this.numDeleteOperations = numOperations;
		
	}
	
	public int getDeleteOperations(){
		
		return numDeleteOperations;
	}
	
}
