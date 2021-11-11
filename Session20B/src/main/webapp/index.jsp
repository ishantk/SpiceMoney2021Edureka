<%@ page import="javax.ws.rs.core.MediaType"%>
<%@ page import="javax.ws.rs.core.UriBuilder"%>
<%@ page import="javax.ws.rs.client.WebTarget"%>
<%@ page import="javax.ws.rs.client.ClientBuilder"%>
<%@ page import="javax.ws.rs.client.Client"%>
<%@ page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REST WEB SERVICE</title>
</head>
<body>

	<center>
		<h3>Welcome to REST Services with Jersey</h3>
	</center>	
		
		<%
			// Consuming the Web Service
			ClientConfig clientConfig = new ClientConfig();
			Client client = ClientBuilder.newClient(clientConfig);
			WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/Session20B").build());
			
			// Send a Request to the Web Service: http://localhost:8080/Session20B/rest/news
			String textResponse = target.path("rest").path("news").request().accept(MediaType.TEXT_PLAIN).get(String.class);
			String htmlResponse = target.path("rest").path("news").request().accept(MediaType.TEXT_HTML).get(String.class);
			String xmlResponse = target.path("rest").path("news").request().accept(MediaType.TEXT_XML).get(String.class);
			String jsonResponse = target.path("rest").path("news").request().accept(MediaType.APPLICATION_JSON).get(String.class);
		
		%>
		
		<center>
			<h5>Plain Text Response</h5>
			<%= textResponse %>
			
			<%-- <h5>HTML Response</h5>
			<%= htmlResponse %>
			
			<h5>XML Response</h5>
			<%= xmlResponse %>
			
			<h5>JSON Response</h5>
			<%= jsonResponse %> --%>
		</center>
		

</body>
</html>