package com.ken.resetpass;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ken.resetpass.*;

@WebServlet("/PassServ")
public class PassServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public PassServ() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pass = request.getParameter("newpass");
		String pass2 =request.getParameter("newpass2");
		String usr = request.getParameter("usr"); 
		
		PassAction pa = new PassAction();
		if(pa.passUpdate(usr, pass, pass2))
		{
			request.getRequestDispatcher("RegisterSuccess.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("Failure.jsp").forward(request, response);
		}
	}
}
