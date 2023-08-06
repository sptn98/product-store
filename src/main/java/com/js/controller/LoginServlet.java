package com.js.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.CustomerCURD;
import com.js.dto.Customer;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Customer c = new Customer();

		String email = req.getParameter("email");

		int password = Integer.parseInt(req.getParameter("pwd"));

		boolean res = CustomerCURD.validateCustomer(email, password);

		if (res) {
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			req.setAttribute("msg", "logged in ");
			rd.forward(req, resp);
		} else {
			PrintWriter pw = resp.getWriter();
			pw.write("<html>\r\n" + "<body>\r\n" + "<h3 style=\"color: red\">Email or password invaild</h3>\r\n"
					+ "</body>\r\n" + "</html>");

			RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
			rd.include(req, resp);
		}
	}

}
