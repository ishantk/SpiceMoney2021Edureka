<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	
	String searchKeyword = request.getParameter("keyword");

	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "auribises");
		String sql = "select * from User where name like '"+searchKeyword+"%'";
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		
		while(rs.next()){
			out.print(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+"<br>");
		}
		
	}catch(Exception e){
		out.print("No Results Found");	
	}
	
%>    