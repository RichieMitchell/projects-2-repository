package Login;

import controller.HttpServlet;
import data.HttpServlet;
import data.HttpServletRequest;
import data.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;


public class WelcomeServlet<Cookie> extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        //Access cookies, now that we have cookies stored lets try to access them:
        //first, we get the cookies from the request:
        Cookie[] cookies = req.getCookies();
        out.println("<h1>Welcome, " + cookies[0].getValue()+ "</h1>");





    }
}
