<%@ page import="com.estore.bean.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
    <h3>Welcome to JSP Action Tags</h3>
    <h3>User Name is: <% request.getParameter("username")%></h3>
    
    <jsp:include page="header.jsp"/>
    
    
    <%
    
    Customer customer1 = new Customer();
    customer1.setName("Fionna");
    %>
    
    <jsp:useBean id="customer2" class="com.estore.bean.Customer"/>
    <jsp:setProperty property="" name="customer2" value="George"/>
    <jsp:setProperty property="" session="customer2" value="Afternoon"/>
    <jsp:setProperty property="" email="customer2" value="George@hotmail.com"/>
    <%
       String data = customer1.sayHello();
        out.print("Data1: "+data);
    %>
    <br>
        <%
       String data = customer2.sayHello();
        out.print("Data2: "+data);
    %>
     <br>
     
     Customer ID:<jsp:getProperty property="cid" name="customer2"/><br> 
     Customer Name:<jsp:getProperty property="name" name="customer2"/><br> 
     Customer Session:<jsp:getProperty property="session" name="customer2"/><br> 
    
    
    </center>


</body>
</html>