package com.database.result;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.database.connection.DBType;
import com.database.crud.OperationType;
import com.database.crud.UpdateOperation;

public class UpdateResult extends Result{

	private boolean flag;
	private int numberUpdates;
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public int getNumberUpdates() {
		return numberUpdates;
	}
	public void setNumberUpdates(int numberUpdates) {
		this.numberUpdates = numberUpdates;
	}
	
}
