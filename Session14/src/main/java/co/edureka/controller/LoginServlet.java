package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.db.DB;
import co.edureka.model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/LoginUser" })
public class LoginServlet extends HttpServlet {
	
	DB db;
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("[LoginServlet] init");
		db = new DB();
		db.createConnection();
	}

	
	public void destroy() {
		System.out.println("[LoginServlet] destroy");
		db.closeConnection();
	}

	
	// Will handle the POST request only from the Client
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[LoginServlet] doPost");

		// 1. Extract the data from the Client and create User Object
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println(user);
		
		// 2. Save the User object in the database
		boolean status = db.loginUser(user);
		
		
		// 3. Send Back the Response to the User
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String message = status ? "Welcome "+user.name : "Invalid Credentials. Please Try Again";
		String linkToHome = "<br><a href='Welcome'>Enter Home</a><br>";

		// 2. URL Re-Writing
		//String linkToHomeWithURLData = "<br><a href='Welcome?name="+user.name+"&email="+user.email+"'>Enter Home</a><br>";
		
		
		// 3. Hidden Form Fields
		String form = "<form action='Welcome' method='post'>"
				+ "<input type='hidden' name='txtName' value='"+user.name+"'>"
				+ "<input type='hidden' name='txtEmail' value='"+user.email+"'>"
				+ "<input type='submit' value='Enter Home'>"
				+ "</form>";
		
		String htmlResponse = "<html>"
				+ "<body>"
				+ "<center><br>"
				+ message
				+ linkToHome
				//+linkToHomeWithURLData
				//+ form
				+ "</center>"
				+ "</body>"
				+ "</html>";
		
		if(status) {
			
			// Session Tracking - Share the Data in between Server Resources
			// 1. Cookies - Write the data
			Cookie cookie1 = new Cookie("keyName", user.name);
			Cookie cookie2 = new Cookie("keyEmail", user.email);
			
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
			// 4. HttpSession
			HttpSession session = request.getSession();
			session.setAttribute("keyUser", user);
			
			//out.print("User Registered"); Text Response
			out.print(htmlResponse);	
		}else {
			response.sendRedirect("https://google.co.in");
		}
		
		
		
		
		
	}
	

}
