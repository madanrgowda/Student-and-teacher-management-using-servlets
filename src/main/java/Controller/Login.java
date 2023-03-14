package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.StudentDao;
import Dao.TeacherDao;
import Dto.Student;
import Dto.Teacher;
@WebServlet("/login1")
public class Login extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException,NullPointerException{
		
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		StudentDao user=new StudentDao();
		TeacherDao user1=new TeacherDao();
		Student A1=user.find(email);
		Teacher b1=user1.find(email);
		
	     if(user.equals(null)){
			resp.getWriter().print("<h1> Invalid user name or password </h1>");  
	    	   req.getRequestDispatcher("Login.html").include(req, resp);
		}
			try {
				if((b1.getPassWord().equals(pass))||(A1.getPassWord().equals(pass))) 
				{
					
				resp.sendRedirect("LoginviewTeaher.html");

			 }
		      }catch (Exception e) {
		    	 		    	   resp.sendRedirect("LoginviewStu.html");
		    	  
		}
}
}