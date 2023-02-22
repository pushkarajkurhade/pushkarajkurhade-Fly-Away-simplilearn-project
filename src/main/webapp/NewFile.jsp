<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP page</title>
</head>
<body>
<%@ page import="java.sql.*" %>

     <% 

    
      ResultSet rs = null;
      Connection con =null;
      Statement ps =null;
      
      
    
      try
      { 
      Class.forName("com.mysql.cj.jdbc.Driver"); 
      con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Munna@123");
      ps =con.createStatement();
      
      String qry="select * from search";
      
      rs=ps.executeQuery(qry);
       while(rs.next()){
    	   out.print("Source : "+rs.getString(2)+"<br/>");
    	   out.print("Destination = "+rs.getString(3)+"<br/>");
    	   out.print("price=5000"+"<br>");
    	   
    	   
    	   
       }
      
    	  
      }catch(Exception ex){}
      
      %>
      <a href="payment.html">Book</a>
</body>
</html>