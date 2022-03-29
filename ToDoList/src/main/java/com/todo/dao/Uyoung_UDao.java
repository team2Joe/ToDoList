package com.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
		//Logincheck
		public int loginCheck(String uid, String upassword) {
			
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet rs = null;
			int result = 0;
		
		try {
			connection = dataSource.getConnection();
			String query = "select count(*) from user where uid = ? and upassword = ?";
			preparedStatement = connection.prepareStatement(query);
			rs = preparedStatement.executeQuery();
			preparedStatement.setString(1, "uid");
			preparedStatement.setString(2, "upassward");
			
			result = rs.getInt(1);
			preparedStatement.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			return result;
		}
		
		
		public void check(String uid, String upassword, String uname, String uphone, String uquestion, String uanswer) {
		
			Connection connection = null;
			PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "insert into user (uid, upassword, uname, uphone, uquestion, uanswer) values (?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, uid);
			preparedStatement.setString(2, upassword);
			preparedStatement.setString(3, uname);
			preparedStatement.setString(4, uphone);
			preparedStatement.setString(5, uquestion);
			preparedStatement.setString(6, uanswer);
		
			
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
				
			
		}
}
