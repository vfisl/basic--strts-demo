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
<h1>Avengers</h1>
	<s:form action="rollin">
	<s:textfield name="student.name" label="Name"></s:textfield>
	<s:textfield name="student.password" label="Password"></s:textfield>
	<s:textfield name="student.age" label="Age"></s:textfield>
	<s:radio name="student.gender" label="Genders" list="{'Male','Female'}" />
	<s:radio name="student.courses" label="Courses" list="{'java','spring'}" />
	<s:textfield name="student.mobileno" label="MobileNo"></s:textfield>
	<s:textfield name="student.allowance" label="Allowences"></s:textfield>
	<s:submit  value="Rollin"> </s:submit>
</s:form>
</body>
</html>