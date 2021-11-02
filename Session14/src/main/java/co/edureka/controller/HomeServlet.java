package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.model.User;


@WebServlet({ "/HomeServlet", "/Welcome" })
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String nameFromURL = request.getParameter("name");
		//String emailFromURL = request.getParameter("email");
		
		String nameFromFormRequest = request.getParameter("txtName");
		String emailFromFormReques = request.getParameter("txtEmail");
		
		StringBuilder userDetails = new StringBuilder("List Of Cookies<br>");
		String name = "";
		
		// 1. Cookies - Read the data
		Cookie[] cookies = request.getCookies();
		for(Cookie ck : cookies) {
			userDetails.append(ck.getName()+" - "+ck.getValue()+"<br>");
			if(ck.getName().equals("keyName")) {
				name = ck.getValue();
			}
		}
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("keyUser");
		
		// Send Back the Response to the User
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String htmlResponse = "<html>"
				+ "<body>"
				+ "<center>"
				//+ "<h3>Welcome to Home. Dear, "+name+"</h3>"
				//+ "<h3>Welcome to Home. Dear, "+nameFromFormRequest+"</h3>"
				//+ "<h3>"+emailFromFormReques+"</h3>"
				+ "<h3>Welcome to Home. Dear, "+user.name+"</h3>"
				+ "<h3>"+user.email+"</h3>"
				+ userDetails.toString()
				+ "</center>"
				+ "</body>"
				+ "</html>";
		
		out.print(htmlResponse);
	}

}
