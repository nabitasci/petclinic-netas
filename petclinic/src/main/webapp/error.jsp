<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Error Page</title>
</head>
<body>
	<font color="red"> An error occurred! </font>
	<c:if test="${not empty message}">
		<hr>
		<table>
			<tr>
				<td colspan="2">Error Details</td>
			</tr>
			<tr>
				<td align="right">Message :</td>
				<td>${message}</td>
			</tr>
			<tr>
				<td align="right" valign="top">Trace :</td>
				<td><c:forEach var="element" items="${trace}">
						${element}<br>
					</c:forEach></td>
			</tr>
		</table>
	</c:if>
</body>
</html>