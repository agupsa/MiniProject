<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
				<td><input type="text" name="id" placeholder="Enter ID of Employee to delete from DataBase" required></td>
			</tr>
						<tr>
				<td><input type="submit" value="Delete"></td>
			</tr>

		</table>
	</form>

</body>
</html>