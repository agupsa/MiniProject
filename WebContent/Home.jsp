<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome To Inventory management System</title>
<style>

ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    background-color:BLACK;
	
    overflow: hidden;
}

li {
    float: left;	
}

li a, .dropbtn {
    display: inline-block;
    color: WHITE;
    text-align: center;
    padding: 14px 16px;   
}

li a:hover, .dropdown:hover .dropbtn {
    background-color: GREEN;	    
}

li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color:BLACK;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba (0,0,0,0.2);
}

.dropdown-content a {
    color: WHITE;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: CENTER;
}

.dropdown-content a:hover {background-color: GREEN}

.dropdown:hover .dropdown-content {
    display: block;
}

</style>

</head>
<body>

<hr>
<ul>
  <li><a class="active" href="home.jsp" TARGET=_top >HOME</a></li>
  
  <li class="dropdown">
    <a class="dropbtn" TARGET=_top >Enter Details</a>
    <div class="dropdown-content">
      <a href="EmployeeRegistration.jsp">Enter New Employee Data</a>
      <a href="CustomerRegistration.jsp">Enter New Customer Data</a>
      <a href="SupplierRegistration.jsp">Enter New Supplier Data</a>
      <a href="ItemRegistration.jsp">Enter New Item in DataBase</a>
    </div>
  </li>
  
  <li class="dropdown">
    <a class="dropbtn" TARGET=_top >Update Details</a>
    <div class="dropdown-content">
      <a href="EmployeeUpdate.jsp">Update Employee Data</a>
      <a href="CustomerUpdate.jsp">Update Customer Data</a>
      <a href="SupplierUpdate.jsp">Update Supplier Data</a>
      <a href="ItemUpdate.jsp">Update Item in DataBase</a>
    </div>
  </li>
  
  <li class="dropdown">
    <a class="dropbtn" TARGET=_top >Delete Details</a>
    <div class="dropdown-content">
      <a href="EmployeeDelete.jsp">Delete Employee Data</a>
      <a href="CustomerDelete.jsp">Delete Customer Data</a>
      <a href="SupplierDelete.jsp">Delete Supplier Data</a>
      <a href="ItemUpdate.jsp">Delete Item in DataBase</a>
    </div>
  </li>
  
  <li class="dropdown">
    <a class="dropbtn" TARGET=_top >Billings</a>
    <div class="dropdown-content">
      <a href="SalesBills.jsp">Sales</a>
      <a href="PurchaseBills.jsp">Purchase</a>
      <a href="ViewSalesBills.jsp">View Sales Bills</a>
      <a href="ViewPurchaseBills.jsp">View Purchase Bills</a>
      <a href="UpdateSalesBills.jsp">Update Sales Bill</a>
      <a href="UpdatePurchaseBills.jsp">Update Purchase Bill</a>
      <a href="DeleteSalesBills.jsp">Delete Sales Bill</a>
      <a href="DeletePurchaseBills.jsp">Delete Purchase Bill</a>
    </div>
  </li>
  
  <li><a class="active" href="AdminLogin.jsp" TARGET=_top>Sign Out</a></li>
  
</ul>
</body>
</html>


