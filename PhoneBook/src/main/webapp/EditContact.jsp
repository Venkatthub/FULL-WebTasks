<%@page import="phonebook.directory.Contacts"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="phonebook.directory.PhoneBook"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Contact</title>
</head>
<body>

	<a href="index.jsp"><button>Home</button></a>
	<%
		PhoneBook book = (PhoneBook) request.getServletContext().getAttribute("option");
	int indexToEdit = Integer.parseInt(request.getParameter("editIndex"));
	Contacts contact = book.getContact().get(indexToEdit);
	%>

	<h2 align="center">Review Changes</h2>

	<p align="center">
		<%=contact%></p>


	<h3>EDIT TO CHANGE</h3>

	<form action="/Directory" method="post">

		Name<input type="text" name="name" value="<%=contact.getName()%>">

		Number<input type="text" name="number"
			value="<%=contact.getNumber()%>"> <br> <input
			type="hidden" name="index" value="<%=indexToEdit%>"> <input
			type="hidden" name="function" value="edit"><input
			type="submit" value="Edit"><a href="AllContacts.jsp"><button>Cancel</button></a>


	</form>

</body>
</html>