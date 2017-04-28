package com.database.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapValue {

	public static Map<String, Object> parameters = new HashMap();
	
	public static void insert(int fileId, int parentId, String name, String path, String extension){
		parameters.put(":fileID", fileId);
		parameters.put(":parentID", parentId);
		parameters.put(":name", name);
		parameters.put(":path", path);
		parameters.put(":extension", extension);
	}
	
/*	public static Map getParamteres(){
		return parameters;
	}*/
	
	public static void selectByName(){
		
		parameters.get(":name");
	}
	
	public static void selectByFileId(){
		parameters.get(":fileID");
	}

}
