<%
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
%>
You are not logged in<br/>
<a href="index.jsp">Please Login</a>
<%} else {
%>
Welcome <%=session.getAttribute("userid")%>

<a href='quiz_set1.html'>Take the quiz</a> <br> </br>


<a href='logout.jsp'>Log out</a>
<%
    }
%>
