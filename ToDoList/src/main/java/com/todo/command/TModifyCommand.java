package com.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dao.TDao;

public class TModifyCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String uid = request.getParameter("uid");
		String cid = request.getParameter("cid");
		
		TDao dao = new TDao();
		
		dao.modify(uid, cid);

	}

}
