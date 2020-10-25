<%@page import="phonebook.Options"%>
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

<<<<<<< Updated upstream
	<a href="index.jsp"><button>Home</button></a>
	<%!static Options book;
	static int indexToEdit;
=======
	<%@ include file="header.html"%>

	<a href="/login/home"><button>Home</button></a>

	<%!PhoneBook book;

	int indexToEdit;

>>>>>>> Stashed changes
	Contacts contact;%>
	<%
<<<<<<< Updated upstream
		book = (PhoneBook) application.getAttribute("option");
	indexToEdit = Integer.parseInt(request.getParameter("editIndex"));
	contact = book.getContact().get(indexToEdit);
=======
		try {

		HttpSession userSession = request.getSession(false);

		String sessionUser = (String) userSession.getAttribute("UserName");

		book = UsersDB.getInstance(sessionUser);

		indexToEdit = Integer.parseInt(request.getParameter("editIndex"));

		contact = book.getContact().get(indexToEdit);
>>>>>>> Stashed changes
	%>

	<h2 align="center">Contact</h2>

	<p align="center">
		<%=contact%></p>
	<%
		} catch (Exception e) {

	response.sendRedirect("/");
	}
	%>


	<h3>EDIT TO CHANGE</h3>

	<form action="/Directory" method="post">

		Name<input type="text" name="name" value="<%=contact.getName()%>">

		Number<input type="text" name="number"
			value="<%=contact.getNumber()%>"> <br> <input
<<<<<<< Updated upstream
			type="hidden" name="index" value="<%=indexToEdit%>"> <input
			type="hidden" name="function" value="edit"><input
			type="submit" value="Confirm"><a href="AllContacts.jsp"><button>Cancel</button></a>
=======
			type="hidden" name="index" value="<%=indexToEdit%>" /> <br> <input
			type="submit" value="Confirm" />
	</form>
	<br>
	<a href="/login/home/contacts"><button>Cancel</button></a>
>>>>>>> Stashed changes




</body>
</html>