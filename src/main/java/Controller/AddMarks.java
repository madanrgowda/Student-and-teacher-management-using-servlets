package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MarksDao;
import Dao.StudentDao;
import Dto.Marks;
@WebServlet("/mark")
public class AddMarks extends HttpServlet{
	
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		 Marks m=new Marks();
		   m.setStandard(req.getParameter("Standard"));
		   m.setRoll_no(Integer.parseInt(req.getParameter("roll")));
		   m.setKannada(Double.parseDouble(req.getParameter("sub1")));
		   m.setMaths(Double.parseDouble(req.getParameter("sub2")));
		   m.setScience(Double.parseDouble(req.getParameter("sub3")));
		    m.setPercentage(Double.parseDouble(req.getParameter("total")));
		   m.setResult(req.getParameter("result"));
		    
		   
		    try {
		    	MarksDao a3=new MarksDao();
		    a3.Save3(m);
		    resp.getWriter().print("<h1> Marks add sucessfully</h1>");
		    }catch (Exception e) {
		    	resp.getWriter().print("<h1>ROll_no Already exits</h1>");
			}
		    }

}
