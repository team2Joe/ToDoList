package com.todo.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dao.TDao;
import com.todo.dto.TDto;

public class TSearchCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String cname = request.getParameter("cname");
		String search = request.getParameter("search");
		
		TDao dao = new TDao();
		
		ArrayList<TDto> dtos = new ArrayList<TDto>();
		
		dtos = dao.search(cname, search);
		
		request.setAttribute("list", dtos);
	}

}
