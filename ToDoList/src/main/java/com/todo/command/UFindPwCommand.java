package com.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dao.kteUDao;
import com.todo.share.Sharevar;

public class UFindPwCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		kteUDao dao = new kteUDao();
		
		String uname = request.getParameter("uname");
		String uphone1 = request.getParameter("uphone1");
		String uphone2 = request.getParameter("uphone2");
		String uphone3 = request.getParameter("uphone3");
		String uphone = uphone1 + "-" + uphone2 + "-" + uphone3;
		String uquestion = request.getParameter("uquestion");
		String uanswer = request.getParameter("uanswer");
		
		String pw = dao.uFindPw(uname, uphone, uquestion, uanswer);
		
		Sharevar.findpwviewpage = (pw == "0") ? "uFindPwForm.jsp":"uFoundPw.do";
		request.setAttribute("upassword", pw);

	}

}
