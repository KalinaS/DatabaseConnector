package com.database.result;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SelectResult extends Result{
	
	private List<Object> content = new ArrayList<Object>();
	ResultSet rs;
	
	public void setContent(ResultSet rs) throws SQLException{
/*		
		for(int i = 0; i < content.size(); i++){
			content.add(item);
		}*/
		
		while(rs.next()){
			content.add(rs.getObject("name"));
		}
	}
	
	public List<Object> getContent(){
		
		return content;
	}
	
}
