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
	
	
	public ArrayList<TDto> list(String suid){ // 諛묒뿉 uid�옉 �뿷媛덈젮�꽌 �븵�뿉 s遺숈엫
		ArrayList<TDto> dtos = new ArrayList<TDto>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			String query = "select * from drawup where uid = ?";
			
			stmt = conn.prepareStatement(query);
			
			stmt.setString(1, suid);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				int cid = rs.getInt("cid");
				String uid = rs.getString("uid");
				String cname = rs.getString("cname");
				String content = rs.getString("content");
				int check = rs.getInt("check");
				int importance = rs.getInt("importance");
				
				TDto dto = new TDto(cid, uid, cname, content, check, importance);
			
			
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
	
	public void modify(String uid, String cid,String content) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try{
			conn = dataSource.getConnection();
			String query = "update drawup set content = ? where cid = ? and uid = ?";
			stmt = conn.prepareStatement(query);
			
			stmt.setString(1, content);
			stmt.setInt(2, Integer.parseInt(cid));
			stmt.setString(3, uid);
			
			stmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally{
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}

	}
	
	public TDto contentView(String suid, String scid) { // �뿷媛덈━�땲源� �븵�뿉 s遺�
		TDto dto = null;
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			String query = "select * from drawup where uid = ? and cid = ?";
		
			stmt = conn.prepareStatement(query);
			
			stmt.setString(1, suid);
			stmt.setInt(2, Integer.parseInt(scid));
			
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				
				int cid = rs.getInt("cid");
				String uid = rs.getString("uid");
				String cname = rs.getString("cname");
				String content = rs.getString("content");
				int check = rs.getInt("check");
				int importance = rs.getInt("importance");

				dto = new TDto(cid, uid, cname, content, check, importance);
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
		return dto;
	}
	
	public void delete(String suid, String cid) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = dataSource.getConnection();
			
			String query = "delete from drawup where uid = ? and cid =?";
			
			stmt = conn.prepareStatement(query);
			
			stmt.setString(1, suid);
			stmt.setInt(2, Integer.parseInt(cid));
			
			stmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	public ArrayList<TDto> search(String scname, String search){
		ArrayList<TDto> dtos = new ArrayList<TDto>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sub = "";
		if(scname.equals("all")){
			sub = "";
		}else{
			sub = "cname = '" + scname + "' and";
			
		}
		String defaultQuery = "select * from drawup where "+ sub +" content like '%" + search + "%'";
		String query = null;
		
		try {
			conn = dataSource.getConnection();
			
			
			if(search != null) {
				query = defaultQuery;
			}
			
			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				int cid = rs.getInt("cid");
				String uid = rs.getString("uid");
				String cname = rs.getString("cname");
				String content = rs.getString("content");
				int check = rs.getInt("check");
				int importance = rs.getInt("importance");
				
				TDto dto = new TDto(cid, uid, cname, content, check, importance);
			
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
	
	
	public TDto add(String uid, String cname, String content) {
		TDto dto = null;
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = dataSource.getConnection();
			String query = "insert into drawup(uid, cname, content) values(?, ?, ?)";
			stmt = conn.prepareStatement(query);
			
			stmt.setString(1, uid);
			stmt.setString(2, cname);
			stmt.setString(3, content);
			
			stmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		return dto;
	}
	
	public void upward(String suid, String scid) {
		
		
	}
	
	
	public void downward(String suid, String scid) {
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
