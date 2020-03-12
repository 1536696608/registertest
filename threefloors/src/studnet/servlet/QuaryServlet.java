package studnet.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import StudentClass.Student;
import mql.student.service.impl.*;
/**
 * Servlet implementation class QuaryServlet
 */
@WebServlet("/QuaryServlet")
public class QuaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		StudentServiceImpl service = new StudentServiceImpl();
		ArrayList<Student> list = service.Queryall();
		
//		for (Student s : list) {
//			
//				System.out.println(s.getSnum());
//				System.out.println(s.getSname());
//				System.out.println(s.getSclass());
//				System.out.println(s.getSpross());
//		}
		request.setAttribute("list", list);
		request.getRequestDispatcher("Welcome.jsp").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
