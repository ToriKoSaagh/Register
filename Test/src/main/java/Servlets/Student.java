package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.StudentDB;

@WebServlet("/SignUp")
public class Student extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String Fullname = request.getParameter("fullname");
		String StudentDepartment = request.getParameter("department");
		String Phone = request.getParameter("phone");
		String Password = request.getParameter("pass");
		String Gender = request.getParameter("gender");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<div style='text-alignment: center;'>");
		out.println("<h2> Form Subbmitted successfuly.</h2>");
		out.println(String.format("<p> Fullname: %s</p>", Fullname));
		out.println(String.format("<p> Department: %s</p>", StudentDepartment));
		out.println(String.format("<p> Phone: %s</p>", Phone));
		out.println(String.format("<p> Password: %s</p>", Password));
		out.println(String.format("<p> Gender: %s</p>", Gender));
		out.println("</div>");
		
		StudentDB stdb = new StudentDB();
		stdb.registration(Fullname, StudentDepartment, Password, Phone, Gender);
	}

}