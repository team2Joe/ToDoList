<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String uname = (String)request.getAttribute("uid");
	String ment = uname == "0" ? "해당 하는 ID를 찾지 못했습니다. \n 다시 확인해주세요":"ID찾기에 성공하였습니다.";
%>
	<h1> <%=ment %></h1>
		<h3> ID = ${uid}</h3>
		 

</body>
</html>