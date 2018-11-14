<%@page import="sun.awt.EmbeddedFrame"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>List of Employees</h3>
<c:if test="${requestScope.message !=null}">
	NOTE : ${message}
</c:if>
<c:if test="${requestScope.empList !=null and
 not empty requestScope.empList}">
<table border="1" cellpadding="3">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Age</th>
		<th>Address</th>
		<th>Mobile No</th>
		<th>Date of joining</th>
		<th>Salary</th>
		<th>Role</th>
		<th>Username</th>
		<th>Password</th>
	</tr>
	<c:forEach items="${requestScope.empList}" var="e"> 		
	<tr>
		<td>${e.per.id}</td>
		<td>${e.per.name}</td>
		<td>${e.per.age}</td>
		<td>${e.per.add}</td>
		<td>${e.per.mob}</td>
		<td>${e.doj}</td>
		<td>${e.sal}</td>
		<td>${e.role}</td>
		<td>${e.l.username}</td>
		<td>${e.l.password}</td>
	</tr>
	</c:forEach>
</table></c:if>

</body>
</html>