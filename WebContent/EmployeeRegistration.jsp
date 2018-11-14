<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Bootsrap css link -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<!--<!-- Bootstrap js and Jquery links 
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>-->
<link rel = "stylesheet" type = "text/css" href = "Form.css" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Employee Registration</title>
</head>
<body>
<div class="container">  
	<form name="EmployeeRegistrationForm" action="EmployeeRegistrationServlet" method="post">
		<input type="number" name="id" required  >
		<input type="text" name="name" required></td>
		<input type="number" name="age" required min="18"></td>
			</tr>
			<tr>
				<th>Address:</th>
				<td><input type="text" name="add" ></td>
			</tr>
			<tr>
				<th>mob:</th>
				<td><input type="tel" name="mob" maxlength="10"  pattern="^[6-9]\d{9}$" ></td>
			</tr>
			<tr>
				<th>Joining Date:</th>
				<td><input type="date" name="doj" ></td>
			</tr>
			<tr>
				<th>Salary:</th>
				<td><input type="number" name="sal" min="0" step="0.01"></td>
			</tr>
			<tr>
				<th>Username:</th>
				<td><input type="text" name="username" ></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="text" name="password" maxlength="30" ></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" onclick="validation"></td>
			</tr>

		</table>
	</form>
	</div>
</body>
</html>