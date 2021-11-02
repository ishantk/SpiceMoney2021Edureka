package co.edureka.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/RegisterServlet", "/Register", "/AddUser" })
public class RegisterServlet extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("[RegisterServlet] - init");
	}


	public void destroy() {
		System.out.println("[RegisterServlet] - destroy");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[RegisterServlet] - service");
		
		
		// Extracting data from the Request :)
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		System.out.println("[RegisterServlet] - service - "+name+" "+email+" "+password);
		
	}

}
