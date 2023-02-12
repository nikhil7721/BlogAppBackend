<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1>
 
<form action="/spring/login" method="POST">
		Name :      <input name="name" type="text" /><br>
		Passeord : <input name="password" type="password"/> 
		 <input type="submit" />
	</form>
</body>
</html>