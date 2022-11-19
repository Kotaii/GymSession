<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h3>Welcome to the JSP page</h3>
   <%
      int a = 10;
      int b = 20;
      int c = a + b;
      out.print("c is: "+c);
   %>
   
   <a href='tags.jsp'>JSP tags</a>
   
   <h3>Register with Us</h3>
   
   <div style="align-items: center;">
   
     <form action="register.jsp" method="post">
     
     Enter Name: <br>
     <input type="text" name="txtName"/><br><br>
     
     Enter Email: <br>
     <input type="text" name="txtEmail"/><br><br>
     
     Enter Password:<br>
     <input type="password" name="txtPassword"/><br><br>
      
      <input type="submit" value="Register"/>
      
      </form>   
</div>

 <a href="login-user.html">Existing User? Login Here</a>
</body>
</html>