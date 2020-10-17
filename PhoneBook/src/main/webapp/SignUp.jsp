<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

	<%@ include file="header.html"%>

	<div style="margin-left: 10px; margin-top: 20px;">
		<a href="index.jsp"><button>Back</button></a>
	</div>


	<div style="margin-top: 120px; margin-left: 300px;">

		<form action="/CreateAccount" method="post">

			Enter UserName <input type="text" name="userName"> Enter
			Password <input type="password" name="password"><br> <br>
			<input type="submit" value="Create Account">

		</form>

	</div>

	<br><br>
	<footer style="background-color: #F89246; padding: 50px;" ></footer>

</body>

</html>