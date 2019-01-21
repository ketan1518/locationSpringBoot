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
<form action="updateloc" method="post">
<pre>
id: <input type="text" name="id" value="${location.id}" readonly> 
fname : <input type="text" name="name" value="${location.name }">
code : <input type="text" name="code" value="${location.code }">
type : Urban <input type="radio" value="urban" ${location.type=='urban'?'checked':'' } name="type">
       Rural <input type="radio" value="rural" ${location.type=='rural'?'checked':'' } name="type">
<input type="submit" value="save">



</pre>
</form>
</body>
</html>