<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorhandler.jsp" %> 
<%@ page buffer="8kb" %>   
<%@ page info="This is a demo on JSP Page" %>
<%@ include file="header.jsp" %>
<%@ page isThreadSafe="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>

		<h3>Welcome to JSP Page</h3>
		We will see JSP Tags here
		<br>
		
		<a href="login.html">Login Here</a>
		
		<h4>Sum of 10 and 20 is: <%= addNumbers(10, 20) %></h4>
	
		<%
			String name = "John Watson";
			int age = 20;
			
			if(age>18){
				
				// out is available implicitly to write the response
				out.print("You can Vote "+name);
			}else{
				out.print("You cannot Vote "+name);
			}
			
		%>
		
		<%!
			int addNumbers(int num1, int num2){
				return num1+num2;
			}
			
		%>
	
	<h5>Name is: <%= name %></h5>
	
		<%
		
			int[] array = {10, 20, 30, 40, 50};
		%>
		
		<h4>Array[1] is: <%= array[1] %></h4>
		
		<jsp:include page="header.jsp"/>
	

		<jsp:useBean id="uRef" class="co.edureka.model.User"/>

		<jsp:setProperty property="name" name="uRef" value="Harry"/>
		<jsp:setProperty property="email" name="uRef" value="harry@example.com"/>
		<jsp:setProperty property="password" name="uRef" value="harry123"/>
	
		<jsp:getProperty property="name" name="uRef"/><br>
		<jsp:getProperty property="email" name="uRef"/><br>
		<jsp:getProperty property="password" name="uRef"/><br>
		
		
		<br>
		<%-- <h3>TAG LIB Example</h3>
		<c:forEach var="i" begin="1" end="10">
			<c:out value="${i}"/><br>
		</c:forEach>	 --%>

</body>
</html>