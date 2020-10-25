<%@page import="phonebook.Options"%>
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

<<<<<<< Updated upstream
	<%!Options book;
	String action;%>
=======
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

>>>>>>> Stashed changes
	<table>
		<%
			book = (PhoneBook) application.getAttribute("option");
		for (int i = 0; i < book.getContact().size(); i++) {
		%>

		<tr>
			<td>
				<h5>
					<%=book.getContact().get(i)%>
				</h5>
			</td>
			<td>
<<<<<<< Updated upstream
				<form action="EditContact.jsp" method="post">
=======

				<form action="/login/home/contacts/edit" method="post">

>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
=======

	<%
		} catch (Exception e) {

	response.sendRedirect("/");
	}
	%>

>>>>>>> Stashed changes
</body>
</html>