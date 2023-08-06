package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.ProductCRUD;
import com.js.dto.Customer;
import com.js.dto.Product;
@WebServlet("/insert")
public class InsertProduct extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Product product =new Product();
	
	int id=Integer.parseInt(req.getParameter("id"));
	product.setId(id);
	String name=req.getParameter("name");
	product.setName(name);
	String brand=req.getParameter("brand");
	product.setBrand(brand);
	double price=Double.parseDouble(req.getParameter("price"));
	product.setPrice(price);
	int quantity = Integer.parseInt(req.getParameter("quantity"));
	product.setQuantity(quantity);
	
	int res= ProductCRUD.insertProduct(product);
	RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
	if (res>0) {
		req.setAttribute("msg", "Inserted product");
		rd.forward(req, resp);
	} else {
req.setAttribute("msg", "failed");
		rd.forward(req, resp);
	}
	

}
}
