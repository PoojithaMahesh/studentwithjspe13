<%@page import="studentwithjspe13.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%List<Student> students=(List)request.getAttribute("list"); %>
<table border="2px">
<tr>
<th>ID</th>
<th>NAME</th>
<th>ADDRESS</th>
<th>EMAIL</th>
<th>PASSWORD</th>
<th>PHONENUMBER</th>
<th>UPDATE</th>
<th>DELETE</th>
</tr>
<%for(Student student:students){ %>
<tr>
<td><%=student.getId() %></td>
<td><%=student.getName() %></td>
<td><%=student.getAddress() %></td>
<td><%=student.getEmail() %></td>
<td><%=student.getPassword() %></td>
<td><%=student.getPhone() %></td>
<td><a href="update?id=<%=student.getId() %>">UPDATE</a></td>
<td><a href="delete?id=<%=student.getId() %>">DELETE</a></td>
</tr>
<%} %>

</table>
</body>
</html>