<%@page import="phonebook.directory.Contacts"%>
<%@page import="phonebook.directory.Direct"%>
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">

		<h3 align="center">Your Contacts</h3>


		<%
			Direct book = (Direct) request.getAttribute("Options");

		for (Contacts contact : book.getContact()) {
		%>

		<h4><%=contact%></h4>
		<button onclick="edit.jsp">EDIT</button>
		<button onclick="<%book.deleteContact(contact);%>">EDIT</button>
		<br>
		<%
			}
		%>
	</div>

	<a href="index.jsp"><button>Back</button></a>

</body>
</html>