package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MarksDao;
import Dao.StudentDao;
import Dto.Marks;
@WebServlet("/View1.html")
public class View1 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MarksDao A1=new MarksDao();
		List<Marks> li=A1.fetchAll(); 
    
  	   req.setAttribute("li", li);
  	   req.getRequestDispatcher("ViewMarks.jsp").forward(req, resp);
}
}