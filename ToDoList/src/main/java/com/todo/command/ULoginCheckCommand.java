package com.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;
import com.todo.dao.UDao;
import com.todo.dao.Uyoung_UDao;

public class ULoginCheckCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		
		String uid = request.getParameter("uid");
		String upassword = request.getParameter("upassword");
		
		UDao udao = new UDao();
				
//		System.out.println(uid);
		
		int logincheck = udao.loginCheck(uid, upassword);
		
		String viewPage = logincheck == 1 ? "list.do":"login.do";
		System.out.println(logincheck);
		
		System.out.println(viewPage);
		request.setAttribute("logincheck", viewPage);
		
	}

}
