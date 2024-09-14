package studentwithjspe13;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentwithjspe13.dao.StudentDao;
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	StudentDao dao=new StudentDao();
	dao.deleteStudentById(id);
	
	req.setAttribute("list", dao.getAllStudents());
	RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
    dispatcher.forward(req, resp);
	
}
}
