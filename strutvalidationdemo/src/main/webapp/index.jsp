<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hello world</h1>
	<s:url action="empform" var="vempform"></s:url>
	<s:a href="%{vempform}">Show employee Form</s:a><br>
	<s:url action="studentform" var="sstudform"></s:url>
	<s:a href="%{sstudform}">Show Student Form</s:a>

</body>
</html>