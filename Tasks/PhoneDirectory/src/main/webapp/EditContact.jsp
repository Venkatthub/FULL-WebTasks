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

	public void init() throws ServletException {
		book = new Directory();
	}%>
	<%
		String name = request.getParameter("name");
	String number = request.getParameter("number");
	boolean status = book.editContact(name, number);
	if (status) {
	%><script type="text/javascript">
		alert("Edited Successfully");
	</script>
	<%
		response.sendRedirect("index.jsp");
	} else {

	response.sendError(300, book.Message);
	}
	%>
</body>
</html>