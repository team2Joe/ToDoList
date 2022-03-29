package com.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class kteUDao {
	
	DataSource dataSource;
	
	public kteUDao() {
		try {
			Context context =  new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/todolist");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String uFindId(String uname,String uphone,String uquestion, String uanswer) {
		
		String id = "0";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			String query = "select uid from user where uname = ? and uphone = ? and uquestion = ? and uanswer = ? ";
			ps = conn.prepareStatement(query);
			ps.setString(1, uname);
			ps.setString(2, uphone);
			ps.setString(3, uquestion);
			ps.setString(4, uanswer);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				id = rs.getString(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
		}
		return id;
	}
	public String uFindPw(String uname,String uphone,String uquestion, String uanswer) {
		
		String pw = "0";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			String query = "select upassword from user where uname = ? and uphone = ? and uquestion = ? and uanswer = ? ";
			ps = conn.prepareStatement(query);
			ps.setString(1, uname);
			ps.setString(2, uphone);
			ps.setString(3, uquestion);
			ps.setString(4, uanswer);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				pw = rs.getString(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(conn != null) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
		}
		return pw;
	}
	
}