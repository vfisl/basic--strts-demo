<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><%
 out.print("welcome  "+session.getAttribute("username"));


%></h1>
<%= session.getId() %>
<%= session.invalidate() %>

<form action="MovieServlet">
Select category<select name="movies">
<option value="thriller" >Thriller</option>
<option value="romance">Romantic</option>
<option value="scienceFic">Science Fictional</option>
<option value="documentory">Documentory</option>
</select>
<input type="submit" value="search">;
</form>
</body>
</html> 