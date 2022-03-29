<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mainPage</title>
</head>
<script type="text/javascript">
	function login() {
		location.href = "login.do"
	} submit
	function register() {
		location.href = "registerform.do"
	}

</script>


<body>
 <table>
	<tr>
		<td><h1> ToDoList</h1></td>
	</tr>
	<tr>
		<td align="center">당신이 해야 할 일을 체크하세요</td>
	</tr>
	
</table>
	<br>	
	<br>	
	<br>	
		<input type="button" value="Sing In" onclick="login()">
		<input type="button" value="Sing up" onclick="register()">
		
		
		
		
		
</body>
</html>