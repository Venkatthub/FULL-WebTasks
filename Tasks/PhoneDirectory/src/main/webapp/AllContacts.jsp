<%@page import="phonebook.directory.Directory"%>
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">

		<%
			Directory book = new Directory();
		Iterator<String> key = book.displayContact().keySet().iterator();
		Iterator<Long> value = book.displayContact().values().iterator();
		%>

		<h3 align="center">Your Contacts</h3>

		<table border="1">
			<%
				for (int i = 0; i < book.displayContact().size(); i++) {
			%>
			<tr>
				<td><%=key.next()%></td>
				<td><%=value.next()%></td>
			</tr>

			<%
				}
			%>

		</table>
	</div>

	<a href="index.jsp"><button>Back</button></a>

</body>
</html>