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

<title>ALL CONTACTS</title>

</head>

<body>

	<%@ include file="header.html"%>

	<h3 align="center">Your Contacts</h3>

	<a href="HomePage.jsp"><button>HOME</button></a>

	<%!PhoneBook book;%>



	<%
		HttpSession userSession = request.getSession(false);

	String sessionName = (String) userSession.getAttribute("UserName");

	book = UsersDB.getInstance(sessionName);
	%>

	<h6 style="margin-left: 1000px">
		User :
		<%=sessionName%>
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

				<form action="EditContact.jsp" method="post">

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



	<br>
	<br>
	<footer style="background-color: #F89246; padding: 50px;"></footer>

</body>
</html>