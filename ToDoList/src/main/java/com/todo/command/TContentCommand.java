package com.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dao.TDao;
import com.todo.dto.TDto;

public class TContentCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String uid = "jennie12";
		String cid = request.getParameter("cid");
		
		TDto dto = new TDto();
		TDao dao = new TDao();
		
		dto = dao.contentView(uid, cid);

		request.setAttribute("contentView", dto);
	}

}
