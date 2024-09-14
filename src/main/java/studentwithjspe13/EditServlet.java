package studentwithjspe13;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentwithjspe13.dao.StudentDao;
import studentwithjspe13.dto.Student;
@WebServlet("/edit")
public class EditServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	String address=req.getParameter("address");
	String phone =req.getParameter("phone");
	long phoneNumber=Long.parseLong(phone);
	int id=Integer.parseInt(req.getParameter("id"));
	
	Student student=new Student();
	student.setAddress(address);
	student.setEmail(email);
	student.setName(name);
	student.setPassword(password);
	student.setPhone(phoneNumber);
	student.setId(id);
	
	
	StudentDao dao=new StudentDao();
	dao.updateStudent(student);
	
	
	req.setAttribute("list", dao.getAllStudents());
	RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
	dispatcher.forward(req, resp);
	
	
	
	
	
	
	
	
	
	
	
}
}
