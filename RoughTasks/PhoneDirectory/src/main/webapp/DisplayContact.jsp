<%@page import="java.util.*"%>
<%@page import="java.io.IOException"%>
<%@page import="phonebook.directory.Directory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying Contacts</title>
</head>
<body>
	<h1 align="center">Your Search</h1>

	<%!Directory book = new Directory();%>

	<%
		String nameIn = request.getParameter("name");
	if (nameIn.isEmpty()) {

		response.sendRedirect("index.jsp");

	} else if (book.displayContact().containsKey(nameIn.toLowerCase())) {

		Map<String, Long> contacts = book.displayContact(nameIn);
	%><table border="1">
		<tr>
			<td>Name</td>
			<td>Contact Number</td>
		</tr>

		<%
			Iterator<String> key = contacts.keySet().iterator();
		Iterator<Long> value = contacts.values().iterator();
		for (int i = 0; i < contacts.size(); i++) {
		%>
		<tr>
			<td><%=key.next()%></td>
			<td><%=value.next()%></td>
		</tr>

		<%
			}
		%>

	</table>

	<%
		} else {
	%><h3 align="center">No Contacts found</h3>

	<%
		}
	%>
	<br>
	<br>
	<a href="index.jsp"><button>Back</button></a>

</body>
</html>