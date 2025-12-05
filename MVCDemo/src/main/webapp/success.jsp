<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="kapilit.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>successs</title>
</head>
<body>

<%
    CredentialBean bean = (CredentialBean) request.getAttribute("credential");
%>

<h2>Login Successful 🎉</h2>
<p>Welcome, <strong><%= bean.getUser() %></strong></p>
</body>
</html>