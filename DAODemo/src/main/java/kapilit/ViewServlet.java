package kapilit;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;
import java.util.*;

@WebServlet("/view")
public class ViewServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        List<Employee> list = EmployeeDAO.getAllEmployees();

        out.println("<h2>Employee List</h2>");
        out.println("<table border='1' width='70%'>");
        out.println("<tr><th>ID</th><th>Name</th><th>Password</th><th>Salary</th><th>Edit</th><th>Delete</th></tr>");

        for (Employee e : list) {
            out.println("<tr>" +
                    "<td>" + e.getId() + "</td>" +
                    "<td>" + e.getName() + "</td>" +
                    "<td>" + e.getPassword() + "</td>" +
                    "<td>" + e.getSalary() + "</td>" +
                    "<td><a href='edit?id=" + e.getId() + "'>Edit</a></td>" +
                    "<td><a href='delete?id=" + e.getId() + "'>Delete</a></td>" +
                    "</tr>");
        }

        out.println("</table>");
    }
}
