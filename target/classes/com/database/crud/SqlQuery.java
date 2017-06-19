package com.database.crud;

public interface SqlQuery {

	
	static final String INSERT = "Insert into File (name, extension, addingDate, directory, type) values (?, ?, curdate(), ?, ?)";
	static final String INSERT_FILE_RELATION = "Insert into file_relation(parent, child) values (?, ?)";
	static final String UPDATE = "Update File set name = ? where fileID = ?";
	static final String SELECT_BY_NAME = "Select  * from file f where f.name = ? order by f.addingDate desc limit 1";
	static final String SELECT_LAST_ID = "Select max(file_id) from File where name = ?";
	static final String DELETE = "Delete from ?";
	static final String DELETE_ITEM = "Delete from file where name = ?";

}