<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%String message=(String)request.getAttribute("message"); %>
<%if(message!=null){ %>
<h1><%=message %></h1>
<%}else{ %>

<%="Welcome to LOGIN PAGE PLEASE LOGIN" %>
<%} %>
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