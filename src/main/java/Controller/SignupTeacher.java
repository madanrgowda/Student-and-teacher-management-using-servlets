package Controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentDao;
import Dao.TeacherDao;
import Dto.Teacher;

@WebServlet("/teach")
public class SignupTeacher extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
Teacher t=new Teacher();
t.setName(req.getParameter("name"));
t.setEmail(req.getParameter("email"));
t.setPassWord(req.getParameter("pass"));
t.setSubject(req.getParameter("sub"));
String input=t.setDOB(req.getParameter("date"));
LocalDate dob = LocalDate.parse(input);  
LocalDate curDate = LocalDate.now(); 
int p=Period.between(dob, curDate).getYears();
t.setAge(p);
t.setGender(req.getParameter("Gender"));
t.setMobile(Long.parseLong(req.getParameter("mobile")));

TeacherDao A2=new TeacherDao();
try {
A2.save1(t);
resp.getWriter().print("<h1> Teacher singup Successfully</h1>");
}catch(Exception e) {
	 resp.getWriter().print("<h1> Email id or Mobile Number Already Exits</h1>");	
}
}
}
