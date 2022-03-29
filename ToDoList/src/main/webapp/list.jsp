<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="search.do">
			검색 : 
				<select name = "cname">
					<option value="all">전체</option>
					<option value="health">건강</option>
					<option value="exercise">운동</option>
				</select>
				<input type="text" name="search" size="20">
				<input type="submit" value="검색">
		</form>
	
		<div align="center">
			<table >
				<c:forEach items="${list }" var="dto">
					<tr>
						<td><input type="checkbox" value="${dto.content }"></td>
						<td><input type="text" name="content" value="${dto.content }"></td>
						<td> <button><a href="downward.do?uid=${dto.uid }&cid=${dto.cid }">∨</a></button> <button><a href="upward.do?uid=${dto.uid }&cid=${dto.cid }">∧</a></button></td>
						<td><a href="contentView.do?uid=${dto.uid }&cid=${dto.cid }">수정</a></td>
						<td><a href="delete.do?uid=${dto.uid }&cid=${dto.cid }"><button>X</button></a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		
	</body>
</html>