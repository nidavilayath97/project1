package com.deloitte.ecommerce;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet
public class HomeServlet extends HttpServlet {

    private Service service=new ServiceImpl(new DaoImpl());

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        HttpSession session = req.getSession();
        String signedOutVal = req.getParameter("signout");
        boolean sessionDestroyed = false;
        if (signedOutVal != null && signedOutVal.equals("true")) {
            session.invalidate();
            sessionDestroyed = true;
        }
        Object mobilenoObj=null;
        if (!sessionDestroyed) {
            mobilenoObj = session.getAttribute("mobileno");
        }

        if (mobilenoObj == null || mobilenoObj.toString().isEmpty()) {
            resp.getWriter().println("please sign in ");
            String signInLink = "<a href='/html/form.html'>Sign In </a> ";
            writer.println(signInLink);
            return;
        }
        String mobileno=mobilenoObj.toString();
        Customer user=service.getUserByMobileno(mobileno);
        int age=user.getAge();
        writer.println("Welcome " + mobileno +" age="+age);
        String signoutLink = "<a href='/second?signout=true'>Sign out </a> ";
        writer.println(signoutLink);

    } 

}
