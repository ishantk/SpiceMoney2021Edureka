<%@page import="co.edureka.db.DB"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Authentication</title>
</head>
<body>

	<h3>Logging in the User ${param.txtEmail}</h3> 


	<%
		
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		if(user.email.isEmpty() || user.password.isEmpty()){
			response.sendRedirect("https://www.google.co.in");
		}
		
		DB db = new DB();
		db.createConnection();
		boolean status = db.loginUser(user);
		db.closeConnection();
		
		
		if(status){
			Cookie ck1 = new Cookie("keyName", user.name);
			response.addCookie(ck1);
			
			session.setAttribute("keyUser", user);
			/* pageContext.setAttribute("keyUser", user, pageContext.SESSION_SCOPE); */
	%>
	
	
			<h3>Login Successfully Done. Thank You <%= user.email %></h3>
			<!-- <a href='home.jsp'>Enter Home</a> -->
			<jsp:forward page="home.jsp"/>
	
	<%		
		}else{
	%>		
			<h3>Login Failed. Please Try Again <%= user.email %></h3>
	<%		
		}
	%>

</body>
</html>