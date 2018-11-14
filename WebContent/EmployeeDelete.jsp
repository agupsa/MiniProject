<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="EmployeeDeleteForm" action="EmployeeDeleteServlet" method="post">
		<table align="center" bgcolor="cyan">
			<tr>
				<th>Id:</th>
				<td><input type="number" name="id" placeholder="Enter ID of Employee to delete from DataBase" required></td>
			</tr>
						<tr>
				<td><input type="submit" value="Delete"></td>
			</tr>

		</table>
	</form>

</body>
</html>