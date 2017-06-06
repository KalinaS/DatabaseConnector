package com.database.crud;

public interface SqlQuery {

	//static final String SELECT_BY_FILEID = "Select * from File where fileID = :fileID";
	//static final String SELECT_BY_NAME = "Select * from File where name = :name";
	
	//static final String INSERT = "Insert into File ( parentID, name, directory, extension, addingDate) values (:parentID, :name, :directory, :extension, curdate())";
	static final String INSERT = "Insert into File (name, extension, addingDate, directory) values (?, ?, curdate(), ?)";
	//static final String UPDATE_NAME = "Update File set name = :name where file = :file";
	static final String UPDATE = "Update File set name = ? where fileID = ?";
	static final String SELECT = "Select * from File where name = ?";
	static final String DELETE = "Delete from ?";
	static final String DELETE_ITEM = "Delete from file where name = ?";
	//static final String SET_FOREIGN_KEY_CHECKS = "Set foreign_key_checks=0";

}