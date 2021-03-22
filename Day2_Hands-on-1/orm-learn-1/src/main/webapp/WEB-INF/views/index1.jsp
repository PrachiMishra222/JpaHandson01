<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/search" method="get">
	<label>Enter Country</label>	<input type="text" name="ele" id="search" /> <input type="submit" name="submit" value="Submit"/> 
</form>

<h1>Countries Which Containing Letter's ${search}</h1>
<table>
<tr><td>Code</td><td>Country</td></tr>
<c:forEach var="i" items="${list1}">
	<tr><td><c:out value="${i.getCode()}"/></td>
	<td><c:out value="${i.getName()}"/></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>