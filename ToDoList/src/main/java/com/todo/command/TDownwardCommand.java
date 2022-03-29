package com.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dao.TDao;

public class TDownwardCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		String uid = request.getParameter("uid");
		String cid = request.getParameter("cid");

		TDao dao = new TDao();
		
		dao.downward(uid, cid);

	}

}
