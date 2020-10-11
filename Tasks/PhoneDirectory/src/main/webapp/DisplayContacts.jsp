<%@page import="java.io.IOException"%>
<%@page import="phonebook.directory.Directory"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying Contact</title>
</head>
<body>
	<h1 align="center">Your Search</h1>

	<%!Directory book = new Directory();%>

	<%
		if (request.getParameter("name").isBlank()) {
	%><script type="text/javascript">
		alert("Please enter name to search");
	</script>
	<%
		response.sendRedirect("index.jsp");
	} else if (book.displayContact().containsKey(request.getParameter("name"))) {
	Map<String, Long> contacts = book.displayContact(request.getParameter("name"));
	%><table border="1">
		<tr>
			<td>Name</td>
			<td>Contact Number</td>
		</tr>
		<%
			for (int i = 0; i < contacts.size(); i++) {
		%>
		<tr>
			<td><%=contacts.keySet().iterator().next()%></td>
			<td><%=contacts.values().iterator().next()%></td>
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
	<br>
	<br>
	<h1 align="center">ALL Contacts Numbers</h1>
	<%
		out.print(book.displayContact());
	%>
</body>
</html>