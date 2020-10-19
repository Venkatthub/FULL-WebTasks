<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>PhoneBook - Create Account</title>
</head>

<body>

	<header><%@ include file="header.html"%></header>

	<div style="margin-left: 10px; margin-top: 20px;">
		<a href="index.jsp"><button>Back</button></a>
	</div>


	<div style="margin-top: 120px; margin-left: 300px;">

		<form action="/CreateAccount" method="post">

			Enter UserName <input type="text" name="userName"> Enter
			Password <input type="password" name="password"><br> <br>
			<input type="submit" value="Create Account">

		</form>

	</div>

</body>

</html>