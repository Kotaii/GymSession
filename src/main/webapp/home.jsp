<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
  <center>
  <h3>Welcome to Home</h3>
  
  <%
     Cookie[] cookies = request.getCookies();
     for(Cookie cookie : cookies){
      %>
  
     <%= cookie.getName() %>   <%= cookie.getValue() %> <br>
     
      <%
      
      %>
  </center>


</body>
</html>