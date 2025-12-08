<%@ page import="kapilit.Employee" %>
<%
    Employee e = (Employee) request.getAttribute("employee");
%>

<h2>Edit Employee</h2>

<form action="update" method="post">
    ID: <input type="text" name="id" value="<%= e.getId() %>" readonly><br><br>
    Name: <input type="text" name="name" value="<%= e.getName() %>"><br><br>
    Password: <input type="text" name="password" value="<%= e.getPassword() %>"><br><br>
    Salary: <input type="text" name="salary" value="<%= e.getSalary() %>"><br><br>

    <input type="submit" value="Update Employee">
</form>
