<%-- 
    Document   : main2
    Created on : 21 Jan, 2016, 9:37:14 AM
    Author     : HP
--%>
     <%-- 
    Document   : main
    Created on : 21 Jan, 2016, 8:29:47 AM
    Author     : HP
--%>

     
   <%@ page import ="java.sql.*" %>
<%
             String m= request.getParameter("hi2");

   
   String u=session.getAttribute("userid").toString();

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fyp",
            "root", "root");
    Statement st = con.createStatement();
   
    //ResultSet rs;
    String stmt="UPDATE learningstylesdb SET perception='"+m+"' where uname= '"+u+"'";
    int  i=st.executeUpdate(stmt);
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("quiz_set3.html");
        
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
%>


%>
