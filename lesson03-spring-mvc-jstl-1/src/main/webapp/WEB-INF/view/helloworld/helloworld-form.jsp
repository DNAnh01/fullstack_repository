<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World Form</title>
</head>
<body>
	<h2>Welcome to hello form</h2>

	<hr>

	<form action="${pageContext.request.contextPath}/helloworld/processForm" method="post">

		<!-- /helloworld/processForm goi la request mapping -->
		<input type = "text" name="fullname" placeholder="What's your name?"/>
		
		<input type = "submit" value="Submit query"/>
	</form>
</body>
</html>