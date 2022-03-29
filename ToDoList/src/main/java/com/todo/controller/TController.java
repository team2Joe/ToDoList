package com.todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.command.TAddCommand;
import com.todo.command.TCommand;
import com.todo.command.TContentCommand;
import com.todo.command.TDeleteCommand;
import com.todo.command.TListCommand;
import com.todo.command.TModifyCommand;


@WebServlet("*.do")
public class TController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TController() {
    	super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
	}
	
	public void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		TCommand command = null;
		
		String viewPage = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		switch(com) {
		
		
		case("/list.do"):
			command = new TListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;
			
		case("/add.do"):
			command = new TAddCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;
			
		case("/contentView.do"):
			command = new TContentCommand();
			command.execute(request, response);
			viewPage = "contentView.jsp";
			break;
			
		case("/modify.do"):
			command = new TModifyCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;
			
		case("/delete.do"):
			command = new TDeleteCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}

}

//controller:
//
//case /main.do (jsp)
//case /login.do(jsp)
//case /loginCheck.do (hid)
//case /idCheck.do (hid)
//case /registerForm.do (jsp)
//case /register.do (hid)
//case /logout.do (hid)
//
//case /list.do
//case /add.do(hid)
//case /upward.do(hid)
//case /downward.do(hid)
//case /delete.do
//case /modify.do(hid)
//
//case /uDelete.do
//case /uModify.do(hid)
//case /uProfileView.do
//case /uFindIdForm.do (jsp)
//case /uFindPwForm.do(jsp)
//case /uFindId.do(hid)
//case /uFindPw.do(hid)
//case /uFound.do

//출력 페이지들
//
//registerForm.jsp
//main.jsp
//list.jsp
//login.jsp
//uProfileView.jsp
//uFindIdForm.jsp
//uFindPwForm.jsp
//uFound.jsp
//uDelete.jsp


