<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>

			<th>id</th>
			<th>fname</th>
			<th>code</th>
			<th>type</th>
			

		</tr>

		<c:forEach items="${displ}" var="d">
			<tr>

				<td>${d.id }</td>
				<td>${d.name }</td>
				<td>${d.code }</td>
				<td>${d.type }</td>
				
		<td><a href="delectlocation?id=${d.id}">delect</a></td>
		<td><a href="updatelocation?id=${d.id }">update</a></td>
			</tr>
		</c:forEach>
 
  <a href="/login">add location</a>
	</table>
</body>
</html>