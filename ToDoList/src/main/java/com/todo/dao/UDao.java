package com.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.todo.dto.UDto;

public class UDao {
	
	DataSource dataSource;
	
	public UDao() {
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
	
	public UDto uProfileView(String sbId) {
		UDto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query ="select * from todolist where uid = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(sbId));
			resultSet =preparedStatement.executeQuery(); //��ȸ
			
			
			if(resultSet.next()) {
				String uid = resultSet.getString("uid");
				String uname = resultSet.getString("uname");
				String upassword = resultSet.getString("upassword");
				String uphone = resultSet.getString("uphone");
				String uquestion = resultSet.getString("uquestion");
				String uanswer = resultSet.getString("uanswer");
			
				
				dto = new UDto(uid, uname, upassword, uphone, uquestion, uanswer);
				
			}			
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
	
		
	}//contentview
	
	public void uModify(String uid, String uname, String upassword, String uphone, String uquestion, String uanswer) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query ="update todolist set uid = ?, uname=?, upassword=?, uphone=? where bId = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, uname);
			preparedStatement.setString(2, upassword);
			preparedStatement.setString(3, uphone);
			preparedStatement.setString(4, uid);	
			preparedStatement.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		
	}//modify
	
	
	
}