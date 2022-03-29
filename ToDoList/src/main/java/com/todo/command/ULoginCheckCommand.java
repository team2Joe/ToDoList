package com.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dao.Uyoung_UDao;

public class ULoginCheckCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		
		String uid = request.getParameter("uid");
		String upassword = request.getParameter("upassword");
		
		Uyoung_UDao udao = new Uyoung_UDao();
		udao.loginCheck(uid, upassword);
	}

}
