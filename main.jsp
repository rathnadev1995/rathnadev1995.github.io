<%-- 
    Document   : main
    Created on : 21 Jan, 2016, 8:29:47 AM
    Author     : HP
--%>
<%@ page import="java.io.*,java.util.*" %>
<html>
<head>
<title>HTTP Header Request Example</title>
</head>
<body>
<center>
<h2>HTTP Header Request Example</h2>
<table width="100%" border="1" align="center">
<tr bgcolor="#949494">
<th>Param Name</th><th>Param Value(s)</th>
</tr>

     
   <%@ page import ="java.sql.*" %>
<%
             String m= request.getParameter("hi1");

    String user = request.getParameter("uname");    
   String u=session.getAttribute("userid").toString();

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fyp",
            "root", "root");
    Statement st = con.createStatement();
   
    //ResultSet rs;
    int i = st.executeUpdate("insert into learningstylesdb values('"+u+"','"+m+"',NULL,NULL,NULL)");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("quiz_set2.html");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
%>


%>
