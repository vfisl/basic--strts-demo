<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Happy Day</h1>
<s:form action="register">
<s:textfield name ="username" label="UserName"></s:textfield>
<s:submit value="register"></s:submit>

</s:form>
</body>
</html>