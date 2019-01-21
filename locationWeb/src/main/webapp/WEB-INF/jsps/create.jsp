<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Signup Form</h2>

<form action="/savef" method="post">

<pre>
id: <input type="text" name=""> 
fname : <input type="text" name="name">
code : <input type="text" name="code">
type : Urban <input type="radio" value="urban" name="type">
       Rural <input type="radio" value="rural" name="type">
<input type="submit">



</pre>

<a href="/display">view all</a>
</form>
${msg}
</body>
</html>