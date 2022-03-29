package com.todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.command.TCommand;
import com.todo.command.UFindIdCommand;
import com.todo.command.UFindPwCommand;
import com.todo.share.Sharevar;


@WebServlet("*.do")
public class kteTController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public kteTController() {
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
		
		String zero = "0";
		
		Sharevar sharevar = new Sharevar();
		
		
		
		
		switch(com) {
		case "/uFindIdForm.do":
			viewPage = "uFindIdForm.jsp";
			break;
		case "/uFindId.do":
			command = new UFindIdCommand();
			command.execute(request, response);
			viewPage = sharevar.findidviewpage;
			break;
		case "/uFindPwForm.do":
			viewPage = "uFindPwForm.jsp";
			break;
		case "/uFindPw.do":
			command = new UFindPwCommand();
			command.execute(request, response);
			viewPage = sharevar.findpwviewpage;
			break;
		case "/uFoundId.do":
			viewPage = "uFoundId.jsp";
			break;
		case "/uFoundPw.do":
			viewPage = "uFoundPw.jsp";
			break;
		case "/uNotFoundPw.do":
			viewPage = "/uFindPwForm.do";
			break;
		default:
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


