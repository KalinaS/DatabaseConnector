package com.database.crud;

import java.util.HashMap;
import java.util.Map;

public class MapValue {

	public static Map<String, Object> parameters = new HashMap();
	
	//insert values into map
	public static void insert(int parentId, String name, String path, String extension){
		parameters.put(":parentID", parentId);
		parameters.put(":name", name);
		parameters.put(":path", path);
		parameters.put(":extension", extension);
	}
	
	//check if map is empty
	public static boolean isParametersEmpty(){
		if(parameters.isEmpty()){
			return true;
		} else {
			return false;
		}
	}


}
