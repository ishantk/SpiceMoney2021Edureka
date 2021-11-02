<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	
	<%
		User user = (User)session.getAttribute("keyUser");
	%>
	
	<h3>Welcome Home, Dear <%= user.name %></h3>
	
	
	<h4>Cookies:</h4>
	<%
	
		Cookie[] cookies = request.getCookies();
		for(Cookie ck : cookies){
			out.print(ck.getValue()+"<br>");
		}
	%>
	
</body>
</html>