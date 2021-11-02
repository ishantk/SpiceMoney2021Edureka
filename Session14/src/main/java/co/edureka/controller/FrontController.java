package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/FrontController", "/Serve" })
public class FrontController extends HttpServlet {
	
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("[FrontController] - service");
		
		String requestType = request.getParameter("txtType");
		
		if(requestType.equals("register")) {
			System.out.println("[FrontController] - Register");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterUser");
			dispatcher.forward(request, response);
			
		}else if(requestType.equals("login")) {
			System.out.println("[FrontController] - Login");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("LoginUser");
			//dispatcher.forward(request, response);
			dispatcher.include(request, response);
			
		}else {
			response.sendRedirect("https://google.co.in");
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String htmlResponse = "<html>"
				+ "<body>"
				+ "<center>"
				+ "<h3>This is Hello from FrontController</h3>"
				+ "</center>"
				+ "</body>"
				+ "</html>";
		
		out.print(htmlResponse);	
			
	}

}
