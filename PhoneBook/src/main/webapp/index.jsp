<%@page import="phonebook.Options"%>
<%@page import="phonebook.directory.Contacts"%>
<%@page import="phonebook.directory.PhoneBook"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>PhoneBook</title>
</head>
<body>

	<header><%@ include file="header.html"%></header>

	<div style="margin-left: 700px;">

		<a href="SignUp.jsp"><button>New User</button></a>

	</div>

	<div align="center" style="margin-top: 70px;">

		<form action="/login" method="post">

			<label for="userName">Name : </label><input type="text"
				name="userName" required="required" placeholder="Enter Name" /> <label
				for="password">Password :</label> <input type="password"
				name="password" required="required" placeholder="Enter Password" /><br>
			<br> <input type="submit" value="Login">

		</form>

	</div>

</body>

</html>