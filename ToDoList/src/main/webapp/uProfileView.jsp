<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">

function umodify() {
	location.href = "login.do"
}
</script>
<body>
	<h1>회원 정보</h1>
	<table>
		<tr>
			<td align="right">ID</td>
			<td><input type="text" size="30" name="uid" value = "${userinfo.uid}" readonly="readonly"></td>
		</tr>
		
		
		<tr>
			<td align="right">이름</td>
			<td><input type="text" size="30" name="uname" value = "${userinfo.uname}" readonly="readonly"></td>
		</tr>

		<tr>
			<td align="right">전화번호</td>
			<td><input type="text" size="30" name="uphone" value = "${userinfo.uphone}" readonly="readonly"></td>
		</tr>
		<tr>
			<td align="right">계정찾기 질문</td>
			<td><input type="text" size="30" name="uquestion" value = "${userinfo.uquestion}" readonly="readonly"></td>
		</tr>
		<tr>
			<td align="right">계정찾기 답변</td>
			<td><input type="text" size="30" name="uanswer" value = "${userinfo.uanswer}" readonly="readonly"></td>
		</tr>
		
		<tr>
			<td></td>
			<td>
			<button onclick="location.href='list.do'">뒤로</button>
			<button onclick="location.href='uModifyForm.do'" >회원 정보 수정</button>
			<button onclick="location.href='udelete.do'" >탈퇴</button>
			</td>
			
		</tr>
		
		
	</table>
	

</body>
</html>