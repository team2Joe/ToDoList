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

// HEAD:ToDoList/src/main/java/com/todo/controller/kteTController.java
import com.todo.command.UFindIdCommand;
import com.todo.command.UFindPwCommand;
import com.todo.share.Sharevar;

import com.todo.command.TContentCommand;
import com.todo.command.TDeleteCommand;
import com.todo.command.TDownwardCommand;
import com.todo.command.TListCommand;
import com.todo.command.TModifyCommand;
import com.todo.command.TSearchCommand;
import com.todo.command.TUpwardCommand;
// c8e32276006d141219f8158c011434ec6b9c8e41:ToDoList/src/main/java/com/todo/controller/TController.java


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
		
		
// HEAD:ToDoList/src/main/java/com/todo/controller/kteTController.java
		
		
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
			
		case("/search.do"):
			command = new TSearchCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;
			
		case("/upward.do"):
			command = new TUpwardCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;
		
		case("/downward.do"):
			command = new TDownwardCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;
		
//c8e32276006d141219f8158c011434ec6b9c8e41:ToDoList/src/main/java/com/todo/controller/TController.java
		
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

//異쒕젰 �럹�씠吏��뱾
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


