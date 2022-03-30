package com.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.todo.dao.UDao;

public class UDeleteCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String uid = (String) session.getAttribute("uid");
		UDao dao = new UDao();
		dao.uDelete(uid);
		
	}

}
