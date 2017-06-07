package com.database.result;

public class UpdateResult extends Result{

	private boolean flag;
	private int numberUpdates;
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public int getNumberUpdates() {
		return numberUpdates;
	}
	public void setNumberUpdates(int numberUpdates) {
		this.numberUpdates = numberUpdates;
	}
	
}
