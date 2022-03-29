package com.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class kteTDao {
	
	DataSource dataSource;
	
	public kteTDao() {
		try {
			Context context =  new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/todolist");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
