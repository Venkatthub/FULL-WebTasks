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
	<h1 align="center">PhoneBook</h1>
	<h3>ADD CONTACT</h3>
	<form action="/Directory" method="post">
		Name <input type="text" name="name" /> Number<input type="number"
			name="number" /> <input type="hidden" name="function" value="add" />
		<input type="submit" value="ADD" />
	</form>
	<br>
	<h4>Your Contacts</h4>
	<a href="AllContacts.jsp"><button>Get Numbers</button></a>
	<%!Options dir = new PhoneBook();%>
	<%
		application.setAttribute("option", dir);
	if (dir.getContact().isEmpty()) {
	%>

	<p>No Contacts to display !</p>

	<%
		} else {
	for (Contacts contact : dir.getContact()) {
	%>
	<p><%=contact.getName().toUpperCase()%></p>
	<br>
	<%
		}
	}
	%>

</body>
</html>