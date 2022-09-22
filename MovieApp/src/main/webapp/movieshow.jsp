<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<% String username=(String)session.getAttribute("username"); %>
<h2>hi ${username}  </h2>
<%= %>
<h1><%
 List<String>  movies=(List)request.getAttribute("movie");
out.print( "movie name is :"+movies);
%></h1>
</body> 
</html>