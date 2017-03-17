package com.ken.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.ken.login.*;
import com.sun.corba.se.spi.orbutil.fsm.Action;

@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginServ() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sess = request.getSession();
		LoginAction la = new LoginAction();
		
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if(la.loginCheck(username, pass))
		{
			sess.setAttribute("custname", la.custName());
			sess.setAttribute("city", la.City());
			sess.setAttribute("mobile", la.Mobile());
			request.getRequestDispatcher("BookDB.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("Failure.jsp").forward(request, response);
		}
	}
}
