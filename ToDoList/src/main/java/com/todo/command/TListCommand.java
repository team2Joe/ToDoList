package com.todo.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.todo.dao.TDao;
import com.todo.dto.TDto;

public class TListCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		
		String uid = (String) session.getAttribute("uid") ;  //request.getParameter("uid");
		
		ArrayList<TDto> dtos = new ArrayList<TDto>();
		TDao dao = new TDao();
		
		dtos = dao.list(uid);
		
		request.setAttribute("list", dtos);
		
	}

}
