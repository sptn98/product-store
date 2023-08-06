<%@page import="com.js.dto.*"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1>PRODUCT TABLE</h1>
	<%
	ArrayList<Product> al = (ArrayList) request.getAttribute("data");
	%>

	<table border="20px">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>BRAND</th>
			<th>PRICE</th>
			<th>QUANTITY</th>
			<th>DELETE</th>
			<th>UPDATE</th>
		</tr>

		<%
		for (Product pro : al) {
		%>

		<tr>
			<td><%=pro.getId() %></td>
			<td><%=pro.getName() %></td>
			<td><%=pro.getBrand()  %></td>
			<td><%=pro.getPrice() %></td>
			<td><%=pro.getQuantity() %></td>
			<td><a href="delete?id=<%=pro.getId()%>">delete</a></td>
			<td><a href="edit?id=<%=pro.getId()%>">edit</a></td>
		</tr>

		<%
		}
		%>

	</table>

</body>
</html>