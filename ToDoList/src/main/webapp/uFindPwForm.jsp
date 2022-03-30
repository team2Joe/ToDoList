<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<h1>Password 찾기</h1>
		
	<form action="uFindPw.do" method="post">
		<table border="1">
			<tr>
				<td>
					이름 :
				</td>	
				<td>
					<input type="text" name = "uname" size="10">
				</td>
			</tr>
			<tr>
				<td>
					휴대폰번호 :
				</td>	
				<td>
					<input type="text" name = "uphone1" size="3"> - 
					<input type="text" name = "uphone2" size="4"> - 
					<input type="text" name = "uphone3" size="4">  
					
				</td>
			</tr>
			<tr>
				<td>
					계정찾기 질문 :
				</td>	
				<td>
				
					<select name = "uquestion">
						<option value = "본인의 고향은?">본인의 고향은?</option>
						<option value = "가장 기억에 남는 선생님 이름은?">가장 기억에 남는 선생님 이름은?</option>
						<option value = "본인 어머니의 이름은?">본인 어머니의 이름은?</option>
						<option value = "본인의 좌우명은?">본인의 좌우명은?</option>
						<option value = "어릴 적 가장 기억의 남는 장소는?">어릴 적 가장 기억의 남는 장소는?</option>
						<option value = "가장 친한 친구의 이름은?">가장 친한 친구의 이름은?</option>
							
					</select>
				</td>
			</tr>
			<tr>
				<td>
					계정찾기 답변 :
				</td>	
				<td>
					<input type="text" name = "uanswer" size="45">
				</td>
			</tr>
			<tr>
				<td>
				</td>
				<td>
					<input type="submit" value="확인">
				</td>
			</tr>
			
		</table>
	</form>
	<% 
	
	String A = (String) request.getAttribute("upassword");
	String B = (A != null) ?  (A.equals("0") ? "일치하지않는 정보입니다.": ""):"";
			
	%>
	<%=B %>
</body>
</html>