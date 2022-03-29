package com.todo.command;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dao.kteUDao;
import com.todo.share.Sharevar;

public class UFindIdCommand implements TCommand {
	

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		Sharevar sharevar = new Sharevar();
		
		kteUDao dao = new kteUDao();
		
		String uname = request.getParameter("uname");
		String uphone1 = request.getParameter("uphone1");
		String uphone2 = request.getParameter("uphone2");
		String uphone3 = request.getParameter("uphone3");
		String uphone = uphone1 + "-" + uphone2 + "-" + uphone3;
		String uquestion = request.getParameter("uquestion");
		String uanswer = request.getParameter("uanswer");
		
		String id = dao.uFindId(uname, uphone, uquestion, uanswer);
		request.setAttribute("uid", id);
		sharevar.findidviewpage = (id == "0") ? "uFindIdForm.jsp":"uFoundId.do";
		
		
		
	}


}
