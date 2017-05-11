package com.database.crud;

import java.sql.ResultSet;
import java.util.List;

public abstract class Result {

	protected ResultSet rs = null;
	private boolean resultFlag = true;
	protected List<Object> content;
	private String message;
	
	public void setResultFlag(boolean resultFlag){
		
		this.resultFlag = resultFlag;
	}
	
	public boolean getResultFlag(){
		
		return resultFlag;
	}
	
	protected abstract void setContent(String columName);
}