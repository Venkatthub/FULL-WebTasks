<%@page import="phonebook.directory.PhoneBook"%>
<%@page import="phonebook.directory.UsersDB"%>
<%@page import="phonebook.directory.Contacts"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PhoneBook - Home</title>
</head>
<body>

	<%@ include file="header.html"%>

	<div style="margin-left: 600px;">
		<a href="/logout"><button>Logout</button></a>
	</div>


	<table>

		<tr>

			<td>

				<div
					style="margin-top: 20px; padding: 20px; background-color: #E5E4E1; margin-left: 80px; margin-right: 500px">

					<h3 align="center">ADD CONTACT</h3>

					<div align="center" style="text-align: center;">

						<form action="/AddContact" method="post">

<<<<<<< HEAD
							<label for="name">Name </label><br>
							<input type="text" name="name" required="required" /><br> <br>
							<label for="number">Contact number </label><br> <input
=======
							<label for="name">Name </label><br> <input type="text"
								name="name" required="required" /><br> <br> <label
								for="number">Contact number </label><br> <input
>>>>>>> PhoneBookSession
								type="number" name="number" required="required" /><br> <br>
							<input type="submit" value="ADD" onclick="addValue()" />

						</form>

					</div>


					<script type="text/javascript">
						function addValue() {

							alert("Number Added");

						}
					</script>

				</div>

			</td>

			<td><%!PhoneBook book;
<<<<<<< HEAD
	boolean flag;%> <%
 	HttpSession userSession = request.getSession(false);

 String sessionUser = (String) userSession.getAttribute("UserName");

 book = UsersDB.getInstance(sessionUser);

 flag = book.getContact().isEmpty();

 pageContext.setAttribute("flag", flag, PageContext.PAGE_SCOPE);
=======
	boolean flag;
	String sessionUser;%> <%
 	try {

 	HttpSession userSession = request.getSession(false);

 	sessionUser = (String) userSession.getAttribute("UserName");

 	book = UsersDB.getInstance(sessionUser);

 	flag = book.getContact().isEmpty();

 	pageContext.setAttribute("flag", flag, PageContext.PAGE_SCOPE);
>>>>>>> PhoneBookSession
 %>
				<h6 style="margin-left: 100px">
					User :
					<%=sessionUser%>
				</h6>

				<h4 style="margin-top: 50px;">Your Contacts</h4> <a
<<<<<<< HEAD
				href="AllContacts.jsp"><button>Get Numbers</button></a> <c:choose>
=======
				href="/login/home/contacts"><button>Get Numbers</button></a> <c:choose>
>>>>>>> PhoneBookSession

					<c:when test="${flag}">

						<p>No Contacts to display !</p>

					</c:when>

					<c:otherwise>

						<%
							for (Contacts contact : book.getContact()) {
						%>


						<p>

							<%=contact.getName().toUpperCase()%>

						</p>

						<%
							}
						%>



					</c:otherwise>

<<<<<<< HEAD
				</c:choose> <br></td>
=======
				</c:choose> <br> <%
 	} catch (Exception e) {

 response.sendRedirect("/");

 }
 %></td>
>>>>>>> PhoneBookSession

		</tr>

	</table>

</body>
</html>