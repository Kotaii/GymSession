<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Tags</title>
</head>
<body>
  <h3>Accessing element from Declarative Tag in Beginning of the Page</h3>
   <%
      out.print("AppName: "+appName+" <br>");
      out.print(punchLine+" <br>");
      //out.print("Discount: "+getDiscount("JUMBO")+" <br>");
      
      %>
   
   
   <h3>Scripplet tag</h3>
 <%
    int x = 10;
    int y = 20;
    int z = x * y;
    
    String name = "Fionna";
    out.print("z is: "+z);
    out.print("Name is: "+name);
   
    
    %>

   <h3>Declarative Tag</h3>
<%!
   String appName ="eStore";
   String punchLine = "We Deliver in no time";

   double getDiscount(String promoCode){
	   
	   if(promoCode.equals("JUMBO")){
		   return 0.40;
	   }
	   
	   return 0.20;
   }
   
    int[] cashBacks = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

%>	

<%
    out.print("Name is: "+name+"<br>");
    out.print("Discount is: "+getDiscount("APPY")+"<br>");
    
%>
   <h3>Expression Tag</h3>
   <b>App Name is: <%= appName %></b>
   <br>
   <i>Discount is: <%= getDiscount("JUMBO") %></i>
</body>
</html>