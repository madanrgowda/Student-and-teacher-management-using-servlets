package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/logout")
public class logout extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	req.getSession(false).invalidate();
	resp.getWriter().print("<h1> logout sucessfully<h1>");
	req.getRequestDispatcher("Login.html");

}
}
