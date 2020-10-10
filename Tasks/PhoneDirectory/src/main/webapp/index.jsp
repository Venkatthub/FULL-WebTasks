<%@page import="phonebook.directory.Directory"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Map"%>
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
	<div align="left">
		<h4>Your Contacts</h4>

		<%!Directory dir = new Directory();%>
		<%
			if (dir.displayContact().isEmpty()) {
		%><p>No Contacts to display !</p>
		<%
			} else {
		for (String name : dir.displayContact().keySet()) {
		%>
		<p><%=name.toUpperCase()%></p>
		<%
			}
		}
		%>
	</div>
	<br>
	<br>
	<div align="center">
		<form action="AddContact.jsp">
			<header>ADD CONTACT</header>
			Name <input type="text" name="name"> Number<input
				type="number" name="number">
			<button type="submit">Add</button>
		</form>

		<br> <br>
		<form action="EditContact.jsp">
			<header>EDIT CONTACT</header>
			Name <input type="text" name="name"> Number<input
				type="number" name="number"> <input type="submit"
				value="Edit">
		</form>

		<br> <br>
		<form action="DeleteContact.jsp">
			<header>DELETE CONTACT</header>
			Name<input type="text" name="name"> <input type="submit"
				value="Delete">
		</form>
		<br> <br>

		<form action="DisplayContacts.jsp">
			<header>DISPLAY CONTACT</header>
			Name<input type="text" name="name"> <input type="submit"
				value="Display">
		</form>
	</div>



</body>
</html>