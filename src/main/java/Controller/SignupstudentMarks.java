package Controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MarksDao;
import Dao.StudentDao;
import Dto.Marks;
import Dto.Student;
@WebServlet("/sign")
public class SignupstudentMarks extends   HttpServlet  { 
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Student s=new Student();
	s.setName(req.getParameter("name"));
	s.setEmail(req.getParameter("email"));
	s.setPassWord(req.getParameter("pass"));
	s.setStandard(req.getParameter("standard"));
	String input=s.setDOB(req.getParameter("date"));
	LocalDate dob = LocalDate.parse(input);  
	LocalDate curDate = LocalDate.now(); 
	int p=Period.between(dob, curDate).getYears();
    s.setAge(p);
    s.setGender(req.getParameter("Gender"));
    s.setMobile(Long.parseLong(req.getParameter("mobile")));
    try {
    	StudentDao s1=new StudentDao();
    	s1.save(s);
    	MarksDao m1=new MarksDao();
        List<Marks> mf=new ArrayList<>();
        s.setM(mf);
    	
    	
    resp.getWriter().print("<h1> student signup Successfully</h1>");
}catch(Exception e) {
	 resp.getWriter().print("<h1> Email id or Mobile Number</h1>");	
}
    
}
}