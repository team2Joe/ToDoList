package com.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.bbs.dao.BDao;
import com.todo.dao.AhUDao;
import com.todo.dao.UDao;

public class UModifyCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		String uid =request.getParameter("uid");
		String uname =request.getParameter("uname");
		String upassword =request.getParameter("upassword");
		String uphone =request.getParameter("uphone");
		String uquestion =request.getParameter("uquestion");
		String uanswer =request.getParameter("unanswer");
		
		
		UDao dao = new UDao();
		dao.uModify(uid, upassword, uname, uphone, uquestion, uanswer) ;

		

	}

}
