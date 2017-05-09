package com.database.crud;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import com.database.connection.DBType;
import com.database.crud.MapValue;

public class UpdateOperation extends Operation implements SqlQuery{

	public UpdateOperation(OperationType operation, DBType dbtype) throws SQLException, IOException, ClassNotFoundException {
		super(dbtype);
	}

	public void executeUpdate() throws SQLException, IOException{
		doOperation(UPDATE_NAME, MapValue.parameters);
	}

	@Override
	protected void executeStatement(String sql, Map<String, Object> parameters) {
		
		PreparedStatement ps = null;
		
		for(Map.Entry<String, Object> p : parameters.entrySet()){
			
			sql = sql.replaceAll(p.getKey(), p.getValue().toString());
		}
		
		try {
			ps = connection.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
