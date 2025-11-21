<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String username = request.getParameter("user");
 String Password = request.getParameter("pass");
 out.println("Welcome to Mr  " + username + " your password is " + Password);
 %>
</body>
</html>