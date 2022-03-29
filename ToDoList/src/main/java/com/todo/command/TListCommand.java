package com.todo.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dao.TDao;
import com.todo.dto.TDto;

public class TListCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String uid = request.getParameter("uid");
		
		ArrayList<TDto> dtos = new ArrayList<TDto>();
		TDao dao = new TDao();
		
		dtos = dao.list(uid);
		
		request.setAttribute("list", dtos);
		
	}

}
