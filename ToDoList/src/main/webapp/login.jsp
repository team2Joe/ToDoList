<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    
<html>
<head>
<meta charset="UTF-8">
    
<title>login</title>
    
<script type="text/javascript">
function logincheck() {
	var form = document.loginForm
	
	if(form.uid.value == ""){
		alert("아이디를 입력해주세요.")
		form.uid.focus();
		return false;
	}else if(form.upassword.value == ""){
		alert("비밀번호를 입력해주세요.")
		form.upassword.focus();
		return false;
	}
	 form.submit()
}
</script>
</head>
<body>
	
	<h1>ToDoList</h1>
	
	<form action="logincheck.do" name="loginForm"  method="post">	
		<table>
			<tr>
				<td align="right">ID</td>
				<td><input type="text" size="30" name="uid"></td>
			</tr>
			
			<tr><td align="right">PW</td>
				<td><input type="text" size="30" name="upassword"></td>
			</tr>
			
			<tr>
				<td></td>
				<td align="center">
				<input type="button" value="Sign in" onclick="logincheck()">
				<a href="registerform.do">Sign up</a>
				</td>
			</tr>
			
			<tr>
				<td align="center" colspan="2">forgot ID</td>
			</tr>
			
			<tr>
				<td align="center" colspan="2">forgot PASSWORD</td>
			</tr>
		
		</table>
	</form>
	
		
	
	
	
	
	
</body>
</html>