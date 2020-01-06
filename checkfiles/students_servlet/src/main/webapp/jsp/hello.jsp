<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<h1> this is jsp type file</h1>
<h3> Before start of code block</h3>
</head>
<body>

</body>
</html>
<%
  for (int i=0 ; i<10; i++){
  out.println("<br> i value=" +i);
  }
  %>
  
  <h3>after end of code block</h3>
  
  <%-- this is jsp comment--%>