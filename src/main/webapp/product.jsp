<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ENTER PRODUCT DETAILS</h1>
<img alt="Products" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdSHtzfa_7mVGCpt-gclVkvN1tGb3kjrIiRA&usqp=CAU">
<form action="insert" method="get">
Product ID: <input type="number" name="id"> <br> <br>
Product Name: <input type="text" name="name"><br> <br>
Product Brand <input type="text" name="brand" ><br> <br>
Product Price: <input type="number" name="price"> <br> <br>
Product quantity: <input type="number" name="quantity"> <br> <br>

<input type="submit" value="save">
</form>
</body>
</html>