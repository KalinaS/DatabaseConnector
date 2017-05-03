package com.database.crud;

public interface SqlQuery {

	static final String SELECT_BY_FILEID = "Select * from File where fileID = :fileID";
	static final String SELECT_BY_NAME = "Select * from File where name = :name";
	
	static final String INSERT = "Insert into File ( parentID, name, directory, extension, addingDate) values (:parentID, :name, :directory, :extension, curdate())";
	
	static final String UPDATE_NAME = "Update File set name = :name where name = :name";

}
