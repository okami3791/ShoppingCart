package com.ken.shop;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CartServ")
public class CartServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CartServ() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sess = request.getSession();
		Date dNow = new Date( );
	    SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy");
	    String d = ft.format(new Date());
	    Random random = new Random();
	    int rand = random.nextInt(255);
	
	    String custnm =(String) sess.getAttribute("custname");
	    String custno =(String) sess.getAttribute("mobile");
	    String custcity =(String) sess.getAttribute("city");
	    String custqty =(String) sess.getAttribute("quan");
	    String bkid =(String) sess.getAttribute("id");
	    
	    CartDAO dao = new CartDAO();
	    
	    if(dao.insertCust(rand,custnm,custno,custcity,custqty,bkid,d))
	    {
	    	request.getRequestDispatcher("ThankYou.jsp").forward(request, response);
	    }
    }
}
