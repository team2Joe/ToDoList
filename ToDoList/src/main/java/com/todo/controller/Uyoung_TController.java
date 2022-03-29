package com.todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.todo.command.TCommand;
import com.todo.command.ULoginCheckCommand;
import com.todo.command.URegisterCheckCommand;


@WebServlet("*.do")
public class Uyoung_TController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Uyoung_TController() {
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
		HttpSession session = request.getSession();
		TCommand command = null;
		
		String viewPage = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		//mainPage
		switch(com) {
		case("/main.do"):
			viewPage = "mainPage.jsp";
			break;
		
		//log in 페이지로 이동.
		case("/login.do"):
			viewPage = "login.jsp";
			break;
		
		//login check!!!
		case("/loginheck.do"):
			command = new ULoginCheckCommand();
			System.out.println("hello");
			command.execute(request, response);
			viewPage=(String)request.getAttribute("logincheck");
			break;
		
		//Sign up page 이동
		case("/registerform.do"):
			viewPage = "registerForm.jsp";
			break;
		
		//회원가입 체크페이지.
		case("/registercheck.do"):
			command = new URegisterCheckCommand();
			command.execute(request, response);
			viewPage = "login.do";
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


