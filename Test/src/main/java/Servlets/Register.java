package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {
	public void doGet ( HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
	}
	
}
