<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="EmployeeRegistrationForm" action="EmployeeRegistrationServlet" method="post">
		<table align="center" bgcolor="cyan">
			<tr>
				<th>Id:</th>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<th>Name:</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>Age:</th>
				<td><input type="text" name="age"></td>
			</tr>
			<tr>
				<th>Address:</th>
				<td><input type="text" name="add"></td>
			</tr>
			<tr>
				<th>mob:</th>
				<td><input type="text" name="mob" maxlength="10" ></td>
			</tr>
			<tr>
				<th>Joining Date:</th>
				<td><input type="date" name="doj"></td>
			</tr>
			<tr>
				<th>Salary:</th>
				<td><input type="text" name="sal"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>

		</table>
	</form>
</body>
</html>