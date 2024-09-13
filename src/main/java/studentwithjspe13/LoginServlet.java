package studentwithjspe13;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentwithjspe13.dao.StudentDao;
import studentwithjspe13.dto.Student;


@WebServlet("/login")
public class LoginServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	
	StudentDao dao=new StudentDao();
	List<Student> list=dao.getAllStudents();
	boolean value=false;
	String studentPassword=null;
	for(Student student:list) {
		if(email.equals(student.getEmail())) {
//			that student is present 
			value=true;
			studentPassword=student.getPassword();
			break;
		}
	}
	if(value) {
//		value=Student is present with that email
		if(password.equals(studentPassword)) {
//		valid password
//			Login success
			resp.sendRedirect("https://www.javatpoint.com/java-basics");
		}else {
//			invalid password
			req.setAttribute("message", "INVALID PASSWORD");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, resp);
		}
	}else {
//		value=false 
//		student is not present with that email
		req.setAttribute("message", "INVALID EMAIl");
		RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
		dispatcher.include(req, resp);
	}
	
	
	
	
	
	
	
	

}
}
