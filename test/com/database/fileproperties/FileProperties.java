package com.database.fileproperties;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FileProperties {

	public Map<Integer, Object> parameters = new HashMap<Integer, Object>();

	private String name;
	private String extension;
	private String directory;
	private String type;
	private int childId;
	private int parentId;
	private int id;
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {

		return name;
	}

	public void setExtension(String extension) {
		
		this.extension = extension;
	}

	public String getExtension() {

		return extension;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public String getDirectory() {

		return directory;
	}

	public void setType(String type) {

		this.type = type;
	}

	public String getType() {

		return type;

	}

	public void setChildId(int id) {
		this.childId = id;
	}

	public int getChildId() {

		return childId;
	}

	public void setParentId(int id) {

		this.parentId = id;
	}

	public int getParentId() {

		return parentId;
	}

}
