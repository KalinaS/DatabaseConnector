package com.database.result;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.database.fileproperties.FileProperties;
import com.mysql.jdbc.ResultSetMetaData;

public class SelectResult extends Result {

	public SelectResult() throws SQLException {

	}

	ResultSet rs;
	Statement st;
	private List<FileProperties> files = new ArrayList<FileProperties>();
	
	public void setContent(ResultSet rs) throws SQLException {
		

		while (rs.next()) {

			FileProperties file = new FileProperties();
			
			file.setId(rs.getInt("file_id"));
			file.setName(rs.getString("name"));
			file.setExtension(rs.getString("extension"));
			file.setDirectory(rs.getString("directory"));
			
			files.add(file);

			// System.out.println("id: " + rs.getObject("file_id") + " name: " +
			// rs.getObject("name") + " path: " + rs.getObject("directory"));
		}
	}

	public List<FileProperties> getContent() {

		return files;
	}

	public void printResult(List<FileProperties> file) throws SQLException {

		
		for(int i = 0; i<files.size(); i++){
			System.out.println("Id: " + files.get(i).getId() +  " ,Name: " + files.get(i).getName() + " ,extension: " + files.get(i).getExtension()+ " ,Dir: " + files.get(i).getDirectory());
		}
	}
}

