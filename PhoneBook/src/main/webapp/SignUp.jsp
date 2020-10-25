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

		<a href="/"><button>Back</button></a>

	</div>


	<div style="margin-top: 120px; margin-left: 300px;">

		<form action="/signup/CreateAccount" method="post">

			<label for="userName">Enter UserName :</label><input type="text"
				name="userName" placeholder="Enter your Username"
				required="required"> <label for="password">Enter
				Password :</label> <input type="password" name="password"
				placeholder="New Password" required="required"><br> <br>

			<input type="submit" value="Create Account">

		</form>

	</div>

</body>

</html>