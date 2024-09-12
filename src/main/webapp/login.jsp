<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%String messagefromlogin=(String)request.getAttribute("message"); %>
<h1><%=messagefromlogin %></h1>
<body>
<form action="login" method="post">
Email::<input type="email" name="email">
<br>
<br>
Password::<input type="password" name="password">
<br>
<br>
<input type="submit" value="LOGIN">
</form>
</body>
</html>