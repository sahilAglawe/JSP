package kapilit;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("id");
        String password = request.getParameter("pass");
        
        CredentialBean bean = new CredentialBean();
        bean.setUser(username);
        bean.setPassword(password);
        
        request.setAttribute("credential", bean);
        
        if(username.equals("admin") && password.equals("1234")) {
             request.getRequestDispatcher("success.jsp").forward(request, response);
        } else {
        request.getRequestDispatcher("failure.jsp").forward(request, response);
        }
        
        
	}

}
