<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:property value="student"/><br>
Name: <s:property value="student.name"/><br>
Age: <s:property value="student.age"/><br>
Gender: <s:property value="student.gender"/>
</body>
</html>