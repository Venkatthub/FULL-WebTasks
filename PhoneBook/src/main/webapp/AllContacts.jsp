<%@page import="phonebook.directory.UsersDB"%>
<%@page import="phonebook.directory.Contacts"%>
<%@page import="phonebook.directory.PhoneBook"%>
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PhoneBook - All Contacts</title>
</head>
<body>
	<%@ include file="header.html"%>
	
	<h3 align="center">Your Contacts</h3>

	<a href="/login/home"><button>HOME</button></a>

	<%!PhoneBook book;%>



	<%
		try {

		HttpSession userSession = request.getSession(false);

		String sessionUser = (String) userSession.getAttribute("UserName");

		book = UsersDB.getInstance(sessionUser);
	%>

	<h6 style="margin-left: 600px">

		User :
		<%=sessionUser%>

	</h6>

	<br>
	<br>

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

				<form action="/login/home/contacts/edit" method="post">

					<input type="hidden" name="editIndex" value="<%=i%>"> <input
						type="submit" value="Edit">

				</form>

			</td>
			<td>

				<form action="/delete" method="post">

					<input type="hidden" name="index" value="<%=i%>"> <input
						type="submit" value="Delete">
				</form>
			</td>
			<%
				}
			%>
		
	</table>


	<%
		} catch (Exception e) {

	response.sendRedirect("/");
	}
	%>


</body>
</html>