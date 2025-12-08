package kapilit;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        int id = Integer.parseInt(req.getParameter("id"));
        Employee e = EmployeeDAO.getEmployeeById(id);

        req.setAttribute("employee", e);
        RequestDispatcher rd = req.getRequestDispatcher("editForm.jsp");
        rd.forward(req, resp);
    }
}
