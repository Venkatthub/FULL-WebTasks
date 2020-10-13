<%@page import="phonebook.directory.Contacts"%>
<%@page import="phonebook.directory.PhoneBook"%>
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ALL CONTACTS</title>
</head>
<body>

	<h3 align="center">Your Contacts</h3>
	<a href="index.jsp"><button>HOME</button></a>

	<%
		ServletContext app = request.getServletContext();
	PhoneBook book = (PhoneBook) app.getAttribute("option");

	String action;
	%>
	<table>
		<%
			for (int i = 0; i < book.getContact().size(); i++) {
		%>

		<tr>
			<td>
				<h5>
					<%=book.getContact().get(i)%>
				</h5>
			</td>
			<td>
				<form action="EditContact.jsp" method="post">
					<input type="hidden" name="editIndex" value="<%=i%>"> <input
						type="submit" value="Edit">
				</form>
			</td>

			<td>
				<form action="/Directory" method="post">
					<input type="hidden" name="index" value="<%=i%>"> <input
						type="hidden" name="function" value="delete"><input
						type="submit" value="Delete">
				</form>
			</td>
			<%
				}
			%>
		
	</table>
</body>
</html>