package kapilit;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String salary = req.getParameter("salary");

        Employee e = new Employee();
        e.setId(id);
        e.setName(name);
        e.setPassword(password);
        e.setSalary(salary);

        EmployeeDAO.update(e);

        resp.sendRedirect("view");
    }
}
