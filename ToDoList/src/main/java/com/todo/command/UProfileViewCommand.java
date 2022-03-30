package com.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;
import com.todo.dao.UDao;
import com.todo.dto.UDto;

public class UProfileViewCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		String uid =(String) session.getAttribute("uid");
		
		UDao dao = new UDao();
		UDto dto = dao.uProfileView(uid);
		
		request.setAttribute("userinfo", dto);
		
	}

}
