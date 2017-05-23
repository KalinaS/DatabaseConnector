package com.database.hibernate;

import java.util.Date;

public class User {

	private int fileID;
	private String name;
	private String extension;
	private String directory;
	private Date addingDate;
	private Date lastScan;
	
	public Date getAddingDate() {
		return addingDate;
	}
	public void setAddingDate(Date addingDate) {
		this.addingDate = addingDate;
	}
	public Date getLastScan() {
		return lastScan;
	}
	public void setLastScan(Date lastScan) {
		this.lastScan = lastScan;
	}
	public int getFileID() {
		return fileID;
	}
	public void setFileID(int fileID) {
		this.fileID = fileID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}

	
}
