package com.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.todo.dao.TDao;
import com.todo.dto.TDto;

public class TAddCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		
		String cname = request.getParameter("cname");
		String content = request.getParameter("content");
		
		TDao dao = new TDao();
		TDto dto = new TDto();
		dto = dao.add(cname, content);
		
	}

}
