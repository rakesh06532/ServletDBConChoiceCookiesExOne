package test;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@SuppressWarnings("serial")
@WebServlet("/log1")
public class AdminLogin extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	  throws ServletException,IOException {
		//String st=req.getParameter("s1");
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		//if(st.equals("AdminLogin")) {
			String fname=new AdminInsertDAO().login(req);
			if(fname==null) {
				pw.println("Invalid Login Details...");
			}
			else {
				pw.println("Welcome Admin:"+fname+"<br>");
				Cookie ck=new Cookie("fname",fname);//object create
				res.addCookie(ck);
			RequestDispatcher rd=req.getRequestDispatcher("log1Link.html");
			rd.forward(req, res);
			}
	//	}
	//	else {
		//	RequestDispatcher rd=req.getRequestDispatcher("log2Link.html");
			//rd.forward(req, res);
		//}
	}

}
