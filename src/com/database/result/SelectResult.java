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
	
	public List<Object> getContent(){
		
		List<Object> item = new ArrayList<Object>();
		
		for(int i = 0; i < content.size(); i++){
			
			item.add(content.get(i));
		}
		
		return item;
	}
	
}
