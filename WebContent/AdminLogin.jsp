<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
	<form action="AdminLoginServlet" method="post">
		<table align="center" bgcolor="cyan">
			<tr>
				<th>
					UserName:
				</th>
				<td>
					<input type="text" name="username" placeholder="Enter Username to login">
				</td>
			</tr>
			<tr>
				<th>
					Password:
				</th>
				<td>
					<input type="password" name="password" placeholder="Enter Password here">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Login">
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>