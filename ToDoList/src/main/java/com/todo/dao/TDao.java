package com.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.todo.dto.TDto;

public class TDao {

	DataSource dataSource = null;
	
	public TDao() {
		try {
			
			
			Context context = new InitialContext();
			
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/todolist");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<TDto> list(String suid){ // 밑에 uid랑 헷갈려서 앞에 s붙임
		ArrayList<TDto> dtos = new ArrayList<TDto>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			String query = "select * from drawup where uid = ?";
			stmt.setString(1, suid);
			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				int order = rs.getInt("order");
				String uid = rs.getString("uid");
				String cname = rs.getString("cname");
				String content = rs.getString("content");
				int check = rs.getInt("check");
				int importance = rs.getInt("importance");
				
				TDto dto = new TDto(order, uid, cname, content, check, importance);
				
				dtos.add(dto);
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}

		}
		
		
		
		return dtos;
	}
	
	
}
