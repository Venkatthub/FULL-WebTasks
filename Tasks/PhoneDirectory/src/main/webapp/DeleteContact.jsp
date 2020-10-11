<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="phonebook.directory.Directory"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deleting Contact</title>
</head>
<body>

	<%!Directory book;

	public void init() throws ServletException {
		book = new Directory();
	}%>
	<%
		String name = request.getParameter("name");
	boolean status = book.deleteContact(name);
	if (status) {
	%><script type="text/javascript">
		alert("Contact Deleted");
	</script>
	<%
		response.sendRedirect("index.jsp");
	} else {

	response.sendError(300, book.Message);
	}
	%>
</body>
</html>