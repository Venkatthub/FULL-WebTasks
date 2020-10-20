<%@page import="phonebook.directory.UsersDB"%>
<%@page import="phonebook.Options"%>
<%@page import="phonebook.directory.Contacts"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="phonebook.directory.PhoneBook"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PhoneBook - Edit Contact</title>
</head>
<body>

	<%@ include file="header.html"%>

	<a href="HomePage.jsp"><button>Home</button></a>

	<%!PhoneBook book;

	int indexToEdit;

	Contacts contact;%>

	<%
		HttpSession userSession = request.getSession(false);

	String sessionUser = (String) userSession.getAttribute("UserName");

	book = UsersDB.getInstance(sessionUser);

	indexToEdit = Integer.parseInt(request.getParameter("editIndex"));

	contact = book.getContact().get(indexToEdit);
	%>

	<h6 style="margin-left: 600px">
		User :
		<%=sessionUser%>
	</h6>
	<br>
	<br>

	<h2 align="center">Contact</h2>

	<p align="center">

		<%=contact%></p>


	<h3>EDIT TO CHANGE</h3>

	<form action="/edit" method="post">

		Name<input type="text" name="name" value="<%=contact.getName()%>">

		Number<input type="text" name="number"
			value="<%=contact.getNumber()%>"> <br> <input
			type="hidden" name="index" value="<%=indexToEdit%>" /> <input
			type="submit" value="Confirm" /> <a href="AllContacts.jsp"><button>Cancel</button></a>


	</form>

</body>
</html>