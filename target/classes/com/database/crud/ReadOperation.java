package com.database.crud;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.database.connection.DBType;

public class ReadOperation extends Operation implements SqlQuery{
	
	public ReadOperation(OperationType operation, DBType dbtype) throws ClassNotFoundException, SQLException, IOException{
		super(dbtype);
	}

	public void executeSelect() throws SQLException, IOException{
		
		//MapValue.selectByName();
		doOperation(SELECT_BY_FILEID, MapValue.parameters);
	}

	@Override
	protected void executeStatement(String sql, Map<String, Object> parameters) {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		for(Map.Entry<String, Object> p : parameters.entrySet()){
			sql = sql.replaceAll(p.getKey(), p.getValue().toString());
		}
		
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()){
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
}