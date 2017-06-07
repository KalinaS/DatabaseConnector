package com.database.result;

import com.database.crud.SqlQuery;

public abstract class Result implements SqlQuery{

	private String message;
	
	
	public void setMessage(String msg){
		this.message = msg;
	}
	
	public String getMessage(){
		return message;
	}
}