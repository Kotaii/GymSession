<%@page import="java.sql.ResultSet"%>
<%@page import="com.estore.db.DB"%>
<%@page import="com.estore.model.User"%>
<%@page import="java.sql.PreparedStatement"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
   
     
<%
    //User object Construction

     User user = new User();
    
     //Extract Data from Form
     
     user.name = request.getParameter("txtName");
     user.email = request.getParameter("txtEmail");
     user.password = request.getParameter("txtPassword");
     

   DB db = DB.getDB();
   
   String sql = "insert into Users values(null, ?, ?, ?)"; 
   //String sql = "delete from Customer where cid = ?";
   PreparedStatement preparedStatement = db.connection.prepareStatement(sql); 
   preparedStatement.setString(1, user.email);
   preparedStatement.setString(2, user.password);
   preparedStatement.setString(3, user.name);
   
   
   
   int result = db.executeUpdate(preparedStatement);
   
   if(result > 1){
%> 	   
   <h3> Thank you for Registration: <%= user.name %></h3>
<%   
   }else{
%>
     <h3>Registration failed: <%= user.name %></h3>
<%
     }
%>