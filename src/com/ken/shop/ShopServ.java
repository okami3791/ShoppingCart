package com.ken.shop;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ShopServ")
public class ShopServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ShopServ() {
        super();
        }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String quan = request.getParameter("quan");
		HttpSession sess = request.getSession();
		
		sess.setAttribute("quan", quan);
		
		request.getRequestDispatcher("ConfirmCart.jsp").forward(request, response);
	
	}
	

}
