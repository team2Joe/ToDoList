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
	String uname = (String)request.getAttribute("upassword");
	String ment = uname == "0" ? "해당 하는 Password를 찾지 못했습니다. \n 다시 확인해주세요":"Password찾기에 성공하였습니다.";
%>
	<h1> <%=ment %></h1>
		<h3> password = ${upassword}</h3>

</body>
</html>