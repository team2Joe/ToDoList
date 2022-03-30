<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    
<html>
<head>
<meta charset="UTF-8">
    
<title>register</title>
    
<script type="text/javascript">
function registerCheck() {
	var form = document.registerForm
	
	if(form.uid.value == ""){
		alert("아이디를 입력해주세요.")
		form.uid.focus();
		return false;
	}else if(form.upassword.value == ""){
		alert("비밀번호를 입력해주세요.")
		form.upassword.focus();
		return false;
	}else if(form.upasswordcheck.value == ""){
		alert("비밀번호 확인창을 입력해주세요.")
		form.upassword.focus();
		return false;
	}else if(form.upassword.value != form.upasswordcheck.value) {
           alert("비밀번호가 서로 일치 하지 않습니다.")
           form.upasswordcheck.focus();
			return false;
        
	}else if(form.uname.value == ""){
		alert("이름을 입력해주세요.")
		form.upassword.focus();
		return false;
	}else if(form.uphone.value == ""){
		alert("전화번호를 입력해주세요.")
		form.upassword.focus();
		return false;
	}else if(form.uanswer.value == ""){
		alert("질문의 답변을 입력해주세요.")
		form.upassword.focus();
		return false;
	}
	 form.submit()
}

function cancel() {
	location.href = "login.do"
}
</script>

</head>
<body>
	
	
	
	<form action="registercheck.do" name="registerForm"  method="post">	
		<table>
			<tr>
				<td align="right">ID</td>
				<td><input type="text" size="30" name="uid"></td>
			</tr>
			
			<tr><td align="right">PW</td>
				<td><input type="password" size="30" name="upassword"></td>
			</tr>
			
			<tr><td align="right">PW확인</td>
				<td><input type="password" size="30" name="upasswordcheck"></td>
			</tr>
			
			<tr>
				<td align="right">이름</td>
				<td><input type="text" size="30" name="uname"></td>
			</tr>

			<tr>
				<td align="right">전화번호</td>
				<td><input type="text" size="30" name="uphone"></td>
			</tr>

			<tr>
				<td align="right">계정찾기 질문</td>
				<td><select name="uquestion">
					<option value="본인의 고향은?">본인의 고향은?</option>
					<option value="가장 기억에 남는 선생님 이름은?">가장 기억에 남는 선생님 이름은?</option>
					<option value="본인 어머니의 이름은?">본인 어머니의 이름은?</option>
					<option value="본인의 좌우명은?">본인의 좌우명은?</option>
					<option value="어릴 적 가장 기억의 남는 장소는?">어릴 적 가장 기억의 남는 장소는?</option>
					<option value="가장 친한 친구의 이름은?">가장 친한 친구의 이름은?</option>
				</select></td>
			</tr>
			
			<tr>
				<td align="right">계정찾기 답변</td>
				<td><input type="text" size="30" name="uanswer"></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input type="button" value="취소" onclick="cancel()">
				
				<input type="button"  value="가입하기" onclick="registerCheck()"></td>
			</tr>
			
			
		</table>
	</form>
	
		
	
	
	
	
	
</body>
</html>