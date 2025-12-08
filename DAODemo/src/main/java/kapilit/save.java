package kapilit;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;

@WebServlet("/save")
public class save extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String salary = req.getParameter("salary");

        Employee e = new Employee();
        e.setId(id);
        e.setName(name);
        e.setPassword(password);
        e.setSalary(salary);

        int status = EmployeeDAO.save(e);

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        if (status > 0) {
            out.println("Employee saved successfully!");
        } else {
            out.println("Error saving employee!");
        }

        req.getRequestDispatcher("index.html").include(req, resp);
    }
}
