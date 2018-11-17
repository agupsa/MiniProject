<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
text-color: black;
}
</style>
<link rel="stylesheet" type="text/css" href="Form.css" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Employee Registration</title>
</head>
<body>
	<div class="container">
		<form name="EmployeeRegistrationForm"
			action="EmployeeRegistrationServlet" method="post">
			<table>
				<tr>
					<th>Employee ID:</th>
					<td><input type="number" name="id" required></td>
				</tr>
				<tr>
					<th>Name:</th>
					<td><input type="text" name="name" required></td>
				</tr>
				<tr>
					<th>Age:</th>
					<td><input type="number" name="age" required min="18"></td>
				</tr>
				<tr>
					<th>Address:</th>
					<td><input type="text" name="add"></td>
				</tr>
				<tr>
					<th>mob:</th>
					<td><input type="tel" name="mob" maxlength="10"
						pattern="^[6-9]\d{9}$"></td>
				</tr>
				<tr>
					<th>Joining Date:</th>
					<td><input type="date" name="doj"></td>
				</tr>
				<tr>
					<th>Salary:</th>
					<td><input type="number" name="sal" min="0" step="0.01"></td>
				</tr>
				<tr>
					<th>Username:</th>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<th>Password:</th>
					<td><input type="text" name="password" maxlength="30"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" onclick="validation"></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>