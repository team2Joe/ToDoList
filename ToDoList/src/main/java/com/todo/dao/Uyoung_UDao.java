package com.todo.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Uyoung_UDao {

	DataSource dataSource = null;
	
	public Uyoung_UDao() {
		try {
			
			
			Context context = new InitialContext();
			
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/todolist");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
		public void loginCheck(String uid, String upassword) {
			
		}
		
		
		public void name() {
			
		}
}
