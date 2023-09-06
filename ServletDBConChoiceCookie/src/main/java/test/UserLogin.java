package test;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;

@SuppressWarnings("serial")
@WebServlet("/log2")
public class UserLogin extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	  throws IOException,ServletException {
		String st=req.getParameter("s1");
		if(st.equals("UserLogin")) {
			RequestDispatcher rd=req.getRequestDispatcher("log2Link.html");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("log1Link.html");
			rd.forward(req, res);
		}
	}

}
