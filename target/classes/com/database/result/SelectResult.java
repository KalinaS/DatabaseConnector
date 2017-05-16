package com.database.result;

import java.util.ArrayList;
import java.util.List;


public class SelectResult extends Result{
	
	private List<Object> content = new ArrayList<Object>();
	
	public void setContent(Object item){
		
		for(int i = 0; i < content.size(); i++){
			content.add(item);
		}
	}
	
	public Object getContent(){
		
		Object item = "";
		
		for(int i = 0; i < content.size(); i++){
			
			item = content.get(i);
		}
		
		return item;
	}
	
}
