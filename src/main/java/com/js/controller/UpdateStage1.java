package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.ProductCRUD;
import com.js.dto.Product;
@WebServlet("/edit")
public class UpdateStage1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id =Integer.parseInt(req.getParameter("id"));
		ProductCRUD pc=new ProductCRUD();
	    Product product=pc.getById(id);
	    
		if(product!=null) {
			
			RequestDispatcher rd=req.getRequestDispatcher("update.jsp");
			req.setAttribute("pro", product);
			rd.forward(req, resp);
		}
		else {
			
			RequestDispatcher rd=req.getRequestDispatcher("resilt.jsp");
					req.setAttribute("msg","No product ");
			rd.forward(req, resp);
		}
	}

}
