<%@page import="database.UsersDB"%>
<%@page import="database.PhoneBook"%>
<%@page import="database.Contacts"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PhoneBook - Edit Contact</title>
</head>
<body>

	<%@ include file="header.html"%>

	<a href="/login/home"><button>Home</button></a>

	<%!PhoneBook book;

	int indexToEdit;

	Contacts contact;%>

	<%
		try {

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

	<%
		} catch (Exception e) {

	response.sendRedirect("/");
	}
	%>

	<h3>EDIT TO CHANGE</h3>

	<form action="/edit" method="post">

		Name<input type="text" name="name" value="<%=contact.getName()%>">

		Number<input type="text" name="number"
			value="<%=contact.getNumber()%>"> <br> <input
			type="hidden" name="index" value="<%=indexToEdit%>" /> <br> <input
			type="submit" value="Confirm" />
	</form>
	<br>
	<a href="/login/home/contacts"><button>Cancel</button></a>


</body>

</html>