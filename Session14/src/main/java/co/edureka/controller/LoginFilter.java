package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

	public void destroy() {
		System.out.println("Filter Destoryed");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// PRE PROCESSING
		out.print("<center><h3>Pre Processing from Filter</h3></center>");
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		
		if(email.isEmpty() || password.isEmpty()) {
			out.print("<center><h3>Email or Password is Required</h3></center>");
		}else {
			// pass the request along the filter chain
			chain.doFilter(request, response); // Take the request to the attached servlet
		}
		
		
		
		// POST PROCESSING
		//out.print("<center><h3>Post Processing from Filter</h3></center>");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter Initialized");
	}

}
