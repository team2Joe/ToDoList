<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>ToDo Modify</h2>
	<form action="modify.do">
		<input type="hidden" name="cid" value="${contentView.cid }">
		<input type="text" name="content" value="${contentView.content }">
		<input type="submit" value="수정">
		<a href="list.do">취소</a>
	</form>
	
</body>
</html>