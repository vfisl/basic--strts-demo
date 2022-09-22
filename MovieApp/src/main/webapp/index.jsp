<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login">
Enter Name<input type="text" name ="username"><br>
Enter Password<input type="password" name ="password"><br>
<input type="submit" value ="login">
</form>
<%pageContext.setAttribute("username","Joe"); %>
<% request.setAttribute("username", "John"); %>
<% session.setAttribute("username", "Priya"); %>
<% application.setAttribute("username", "Rahul"); %>
<% session.setAttribute("message", "Have a great day"); %>
<% application.setAttribute("newmessage", "Backend training is compleetd"); %>
<a href="eldemo.jsp">show</a>

</body>
</html> 