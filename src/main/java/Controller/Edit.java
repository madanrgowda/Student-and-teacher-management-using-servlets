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

  
@WebServlet("/MT")
public class Edit extends HttpServlet{
	
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Marks m1=new Marks();
		 Marks m=new Marks();
		   m.setStandard(req.getParameter("Standard"));
		   m.setRoll_no(Integer.parseInt(req.getParameter("roll")));
		   m.setKannada(Double.parseDouble(req.getParameter("sub1")));
		   m.setMaths(Double.parseDouble(req.getParameter("sub2")));
		   m.setScience(Double.parseDouble(req.getParameter("sub3")));
		   m.setPercentage(Double.parseDouble(req.getParameter("total")));
		   m.setResult(req.getParameter("result"));
      
       MarksDao A1=new MarksDao();
       A1.edit(m);
      
 List<Marks> li=A1.fetchAll();
       
       req.setAttribute("li", li);
	   req.getRequestDispatcher("ViewMarks.hmtl").forward(req, resp);
}
}
