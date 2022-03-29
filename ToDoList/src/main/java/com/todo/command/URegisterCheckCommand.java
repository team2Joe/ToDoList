package com.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dao.Uyoung_UDao;

public class URegisterCheckCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String uid = request.getParameter("uid");
		String upassword = request.getParameter("upassword");
		String uname = request.getParameter("uname");
		String uphone = request.getParameter("uphone");
		String uquestion = request.getParameter("uquestion");
		String uanswer = request.getParameter("uanswer");
		
		Uyoung_UDao dao = new Uyoung_UDao();
		dao.check(uid, upassword, uname, uphone, uquestion, uanswer);
	}

}
