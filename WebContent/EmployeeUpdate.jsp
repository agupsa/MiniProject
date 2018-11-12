<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="EmployeeUpdateForm" action="EmployeeUpdateServlet" method="post">
		<table align="center" bgcolor="cyan">
			<tr>
				<th>Id:</th>
				<td><input type="text" name="id" placeholder="Must provide Employee Id" required></td>
			</tr>
			<tr>
				<th>Name:</th>
				<td><input type="text" name="name" placeholder="Leave Empty if no update in this field"></td>
			</tr>
			<tr>
				<th>Age:</th>
				<td><input type="text" name="age" placeholder="Leave Empty if no update in this field"></td>
			</tr>
			<tr>
				<th>Address:</th>
				<td><input type="text" name="add" placeholder="Leave Empty if no update in this field"></td>
			</tr>
			<tr>
				<th>mob:</th>
				<td><input type="text" name="mob" maxlength="10" placeholder="Leave Empty if no update in this field"></td>
			</tr>
			<tr>
				<th>Joining Date:</th>
				<td><input type="date" name="doj" placeholder="Leave Empty if no update in this field"></td>
			</tr>
			<tr>
				<th>Salary:</th>
				<td><input type="text" name="sal" placeholder="Leave Empty if no update in this field"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>
			</tr>

		</table>
	</form>
</body>
</html>