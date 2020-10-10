<%@page import="java.io.IOException"%>
<%@page import="phonebook.directory.Directory"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Contacts Numbers</h1>

	<%!Directory book = new Directory();%>
	<%
		String userName = request.getParameter("name");
	Map<String, Long> contacts = book.displayContact(userName);
	out.println(contacts);
	%><br>
	<br>
	<h1 align="center">ALL Contacts Numbers</h1>
</body>
</html>