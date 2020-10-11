<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="phonebook.directory.Directory"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editing Contact</title>
</head>
<body>
	<%!Directory book;
	static boolean confirm;

	public void init() throws ServletException {
		book = new Directory();
	}%>
	<%
		String name = request.getParameter("name");
	String number = request.getParameter("number");
	if (name.isEmpty() && number.isEmpty()) {
		response.sendRedirect("index.jsp");
	}
	%>
	<p align="center">
		<B>Review Changes</B><br> <br>
		<%
			out.print(name.toUpperCase() + " : " + book.displayContact().get(name));
		%><br>
		<%
			out.println(" NEW NUMBER :" + number);
		%>

		<br> <br>
	<form action="/edit">
		<input type="text" name="cName" value=<%=name%>> <input
			type="text" name="cNumber" value=<%=number%>> <input
			type="submit" value="Confirm" /> <input type="submit" value="Cancel"
			formaction="index.jsp" />
	</form>


</body>
</html>