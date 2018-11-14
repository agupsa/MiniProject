<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet" type = "text/css" href = "Login.css" />
<title>Admin Login</title>
</head>
<body>
<div class="login">
  <div class="heading">
    <h2>Log in</h2>
    <form action="AdminLoginServlet" method="post">

      <div class="input-group input-group-lg">
        <span class="input-group-addon"><i class="fa fa-user"></i></span>
        <input type="text" class="form-control" name="username" placeholder="Username">
      </div>

      <div class="input-group input-group-lg">
        <span class="input-group-addon"><i class="fa fa-lock"></i></span>
        <input type="password"  name="password" class="form-control" placeholder="Password">
      </div>

      <button type="submit" class="float">Login</button>
    </form>
  </div>
</div>
</body>
</html>