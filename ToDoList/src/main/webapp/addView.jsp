<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Add ToDo</h2>
	
	<form action="add.do?uid=${param.uid }">
		<select name="cname">
			<option value="운동">운동</option>
			<option value="건강">건강</option>
		</select>
		<input type="text" name="content">
		<input type="submit" value="작성">
		<a href="list.do">취소</a>
	</form>
</body>
</html>