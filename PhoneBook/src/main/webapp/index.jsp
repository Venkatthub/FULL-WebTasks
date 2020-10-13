
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


	<form action="/Directory" method="post">
		<header>ADD CONTACT</header>
		Name <input type="text" name="name"> Number<input
			type="number" name="number"> <input type="hidden"
			name="function" value="add"> <input type="submit" value="ADD">
	</form>

	<br>
	<br>

	<div align="left">
		<table>
			<tr>
				<td><h4>Your Contacts</h4></td>
				<td><a href="AllContacts.jsp"><button>Get Numbers</button></a></td>
			</tr>
		</table>


		<%
			PhoneBook dir = new PhoneBook();
		ServletContext app = getServletContext();
		app.setAttribute("option", dir);
		%>

		<%
			if (dir.getContact().isEmpty()) {
		%>
		<p>No Contacts to display !</p>

		<%
			} else {

		for (Contacts contact : dir.getContact()) {
		%><h2><%=contact.getName().toUpperCase()%></h2>

		<%
			}
		}
		%>

	</div>

</body>
</html>