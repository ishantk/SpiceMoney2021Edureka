package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.DB;
import co.edureka.model.User;


@WebServlet({ "/RegisterServlet", "/RegisterUser" })
public class RegisterServlet extends HttpServlet {
	
	DB db;
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("[RegisterServlet] init");
		db = new DB();
		db.createConnection();
	}

	public void destroy() {
		System.out.println("[RegisterServlet] destroy");
		db.closeConnection();
	}

	
	// Can handle any HTTP Method Request
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[RegisterServlet] service");

		// 1. Extract the data from the Client and create User Object
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		
		// TASK: Hash the Passwords before your save them in DataBase
		// API: MessageDigest | SHA
		user.password = request.getParameter("txtPassword");
		
		System.out.println(user);
		
		// 2. Save the User object in the database
		boolean status = db.registerUser(user);
		
		
		// 3. Send Back the Response to the User
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String message = status ? "Thank You For Your Registration "+user.name : "Something Went Wrong. Please try agian";
		
		String htmlResponse = "<html>"
				+ "<body>"
				+ "<center>"
				+ message
				+ "</center>"
				+ "</body>"
				+ "</html>";
		
		//out.print("User Registered"); Text Response
		out.print(htmlResponse);
		
		
	}

}
