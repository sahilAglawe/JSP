<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="kapilit.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>failure</title>
</head>
<body>

<%
    CredentialBean bean = (CredentialBean) request.getAttribute("credential");
%>

<h2>Login Failed ❌</h2>
<p>Sorry, <strong><%= bean.getUser() %></strong>. Invalid credentials.</p>
</body>
</html>