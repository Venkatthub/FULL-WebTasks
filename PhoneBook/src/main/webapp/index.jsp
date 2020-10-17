<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PhoneBook</title>
</head>
<body>

	<%@ include file="header.html"%>

	<div style="margin-left: 1000px;">
		<a
		href="SignUp.jsp"><button>New User</button></a></div>


	<div align="center" style="margin-top: 70px;">

		<form action="/login" method="post">

			Name <input type="text" name="userName" /> Password <input
				type="password" name="password" /><br> <br> <input
				type="submit" value="Login">

		</form>


	</div>
	
	<br><br>
	<footer style="background-color: #F89246; padding: 50px;" ></footer>

</body>
</html>