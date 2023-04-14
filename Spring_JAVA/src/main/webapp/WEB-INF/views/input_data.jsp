<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>input_data</title>
</head>
<body>
	<h1>input_data</h1>
	<hr />
	
	<form:form action="input_pro" method="post" modelAttribute="dataBean">
		data1 : <form:input type="text" path="data1"/><br/>
				<form:errors path="data1" style="color:red" /><br/> 
		
		data2 : <form:input path="data2" type='text'/><br/>
				<form:errors path='data2' style="color:red" /><br/>
			
		data3 : <form:input path="data3" /><br/>
				<form:errors path='data3' style="color:red" /><br/>
				
		<form:button type="submit">확인</form:button>
	
	
	</form:form>
	
	
</body>
</html>