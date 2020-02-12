<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test</title>
</head>
<body>
	<c:if test="${!empty form.result }"><p><c:out value="${ form.result }"/></p></c:if>
	
	<form action="true" method="post">	
		<p>
		
			<label for="login">Login :</label>
			<input type="text" name="login" id ="login"/>
		</p>
		
		<p>
			<label for="pass">Mot de passe :</label>
			<input type="password" name="pass" id ="pass"/>
		</p>	
		
		<input type="submit" />
	
	</form>
	
	
	
	
</body>
</html>