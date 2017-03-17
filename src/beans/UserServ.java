package beans;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ken.daos.UserDAOS;

@WebServlet("/UserServ")
public class UserServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UserServ() {
        super();
       
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String m= request.getParameter("m_no");
	    String pass1 = request.getParameter("pass");
	    String email1 =  request.getParameter("email");
	    String add11 = request.getParameter("add1");
	    String add21 =  request.getParameter("add2");
	    String city1 = request.getParameter("city");
	    String pin1 = request.getParameter("pin");
	    
	    
	    UserInfo u = new UserInfo();
	    
	    u.setAdd1(add11);
	    u.setAdd2(add21);
	    u.setCity(city1);
	    u.setEmail(email1);
	    u.setM_no(m);
	    u.setPass(pass1);
	    u.setPin(pin1);
	    u.setName(name);
	    
	    UserDAOS dao = new UserDAOS();
	    
	    if(dao.insertUser(m,pass1,email1,add11,add21,pin1,city1,name))
	    {
	    	request.getRequestDispatcher("RegisterSuccess.jsp").forward(request, response);
	    }
	    else
	    {
	    	request.getRequestDispatcher("Failure.jsp").forward(request, response);
	    }
	    
	}

}
