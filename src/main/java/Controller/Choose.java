package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Role")
public class Choose extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Role=req.getParameter("role");
		if(Role==null) {
			resp.getWriter().print("<h1>Atleast select one Role</h1>");
			req.getRequestDispatcher("ChooseRole.html").include(req, resp);
		}
		if(Role.equals("teacher")) {
			resp.sendRedirect("TeacherSign.html");
		}
	else {
		 
			resp.sendRedirect("StudentSign.html");
		}
	}

}
