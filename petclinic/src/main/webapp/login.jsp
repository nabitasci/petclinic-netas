<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<form action="login" method="post">
		Username:<input name="username" type="text" /><br /> 
		Password:<input name="password" type="password" /><br /> 
		Remember Me:<input name="remember-me" type="checkbox"><br /> 
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
		<input type="submit" value="Login">
	</form>
	<font color="red"> <c:if test="${not empty param.error}">
			<c:out value="Login Failed, Try Again..."></c:out>
		</c:if>
</body>
</html>