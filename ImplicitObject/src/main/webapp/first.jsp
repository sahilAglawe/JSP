<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="second.jsp">
    <% String user = request.getParameter("uname");
       String pass = request.getParameter("upass");
       Cookie ck = new Cookie("loginId", user);
       response.addCookie(ck);
       
       out.println("welcome to the site " + user);
    %>
    <br>
    <input type="submit" value="enter"> 
    </form>
</body>
</html>