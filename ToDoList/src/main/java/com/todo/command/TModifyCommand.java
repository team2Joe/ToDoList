package com.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.todo.dao.TDao;

public class TModifyCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		String cid = request.getParameter("cid");
		String content = request.getParameter("content");
		String uid = (String) session.getAttribute("uid");
		TDao dao = new TDao();
		
		dao.modify(uid, cid, content);

	}

}
