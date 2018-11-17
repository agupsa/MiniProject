<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="home.css">

</head>
<body>
<%
	if(session.getAttribute("username")==null){
		response.sendRedirect("AdminLogin.jsp");
	}
	

%>

<nav role='navigation' id="mainnav" role="navigation">
  <ul>
    <li><a href="Home.jsp">HOME</a></li>
    <li><a href="EmployeeRegistration.jsp">Enter Employee Details</a></li>
    <!-- <li><a href="EmployeeUpdate.jsp">Update Employee Details</a></li> -->
    <li><a href="EmployeeDelete.jsp" >Delete Employee Record</a></li>
    <li><a href="EmployeeDispServlet">View All Employee Details</a></li>
    <!-- <li><a href="EmployeeSearch.jsp">Search Employee Details</a></li> -->
    <li><a href="AdminLogin.jsp" >Sign Out</a></li>
  </ul>
</nav>  

<div class="hamb">
  <a href="#"><i class="fa fa-bars"></i></a>
</div>

  <div class="hero">
    <h1></h1>
  </div>

<canvas id="bubble"></canvas>
<!-- <script src="home.js"></script> -->

</body>
</html>


	