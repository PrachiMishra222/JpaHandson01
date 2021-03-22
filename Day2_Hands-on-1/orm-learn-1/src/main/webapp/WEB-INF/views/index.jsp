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
<a href="?start=a">a</a>|<a href="?start=b">b</a>|<a href="?start=c">c</a>|
<a href="?start=d">d</a>|<a href="?start=e">e</a>|<a href="?start=f">f</a>|
<a href="?start=g">g</a>|<a href="?start=h">h</a>|<a href="?start=i">i</a>|
<a href="?start=i">j</a>|<a href="?start=k">k</a>|<a href="?start=l">l</a>|
<a href="?start=m">m</a>|<a href="?start=n">n</a>|<a href="?start=o">o</a>|
<a href="?start=p">p</a>|<a href="?start=q">q</a>|<a href="?start=r">r</a>|
<a href="?start=s">s</a>|<a href="?start=t">t</a>|<a href="?start=u">u</a>|
<a href="?start=v">v</a>|<a href="?start=w">w</a>|<a href="?start=x">x</a>|
<a href="?start=y">y</a>|<a href="?start=z">z</a>
<h1>Countries with Starting Letter ${start}</h1>
<!-- <h4>${list}</h4>-->
<table>
<tr><td>Code</td><td>Country</td></tr>
<c:forEach var="i" items="${list}">
	<tr><td><c:out value="${i.getCode()}"/></td>
	<td><c:out value="${i.getName()}"/></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>