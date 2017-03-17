package com.ken.book;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ken.book.*;

@WebServlet("/BookServ")
public class BookServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public BookServ() {
        super();
        }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("rbutt");
				
		HttpSession sess = request.getSession();
		BookAction ba = new BookAction();
		ba.BookURL(id);
		
		Book b = new Book();
		
		b= ba.BookURL(id);
		
		String i= b.getBookid();
		String n =b.getBookname();
		String a =b.getAuthor();
		String p =b.getPrice();
		
		sess.setAttribute("id", i );
		sess.setAttribute("a", a);
		sess.setAttribute("n", n);
		sess.setAttribute("p",p);
		
		request.getRequestDispatcher("ShoppingCart.jsp").forward(request, response);
		}
}
