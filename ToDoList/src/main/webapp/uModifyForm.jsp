<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 및 탈퇴</title>
</head>
<body>

<h2>회원 정보 수정</h2>
<table border ="0">
<form action="modify.do" method="post">
	<tr>
		<td>ID</td>
		<td><input type="text" name="bId" size ="20" value ="${uProfileView.uid}" readonly="readonly" >

	</tr>
	<tr>
		<td>PW</td>
		<td><input type="text" name="bId" size ="20" value ="${uProfileView.upassword}" readonly="readonly" >

	</tr>
	<tr>
		<td>PW 확인</td>
		<td><input type="text" name="bId" size ="20" value ="${uProfileView.upassword}" readonly="readonly" >

	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="uName" size ="20" value ="${uProfileView.uname}" >
	</td>
	</tr>
	<tr>
		<td>휴대폰</td>
		<td><input type="text" name="uphone" size ="30" value ="${uProfileView.uphone}"  >
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
	</form>
</table>
		<form action=udelete.do" method="post">
		<input type="hidden" name="bId"  value ="${uProfileView.uid}">
		<input type="submit" value="탈퇴"></form>

</body>
</html>