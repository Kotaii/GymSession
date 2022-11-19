<%@page import="com.google.protobuf.Empty"%>
<%@page import="com.estore.model.User"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.estore.db.DB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<meta charset="UTF-8">

<%


   User user = new User();
   
   user.email = request.getParameter("txtEmail");
   user.password = request.getParameter("txtPassword");
   
   DB db = DB.getDB();
   
   String sql = "select * from Users where email = ? and password = ?";
   PreparedStatement preparedStatement = db.connection.prepareStatement(sql);
   preparedStatement.setString(1, user.email);
   
   //preparedStatement.setString(2, user.name);
   
   preparedStatement.setString(2, user.password);
   
   ResultSet set = db.executeQuery(preparedStatement);
   
   if(set.next()){
	   
	   user.name = set.getString("name"); //we are getting the name from the DB
	  
 	   
	   // Cookies
     Cookie cookie1 = new Cookie("keyName", user.name);
     Cookie cookie2 = new Cookie("keyEmail", user.email);
 
     response.addCookie(cookie1);
     response.addCookie(cookie2);
  
     String res = "<a href='home.jsp?name="+user.name+"email="+user.email+"'>Enter Home</a>";
     out.print(res);
  
  %> 
   
  <h3>Thank you for logging in: <%= user.name %></h3>
  
<%
   } else {
%>	 
	 <h3>login failed.Please try again!!</h3>
<% 	 
    }
%> 




