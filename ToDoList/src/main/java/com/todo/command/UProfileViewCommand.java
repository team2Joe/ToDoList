package com.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.todo.dao.AhUDao;
import com.todo.dao.UDao;
import com.todo.dto.AhUDto;
import com.todo.dto.UDto;

public class UProfileViewCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		
		String uid =request.getParameter("uid");
		UDao dao = new UDao();
		UDto dto = dao.uProfileView(uid);
		
		request.setAttribute("uProfileView", dto);
	}

}
