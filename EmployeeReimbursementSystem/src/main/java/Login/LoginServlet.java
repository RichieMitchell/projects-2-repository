package Login;


import data.HttpServlet;
import data.HttpServletRequest;
import data.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");


        PrintWriter out = req.getWriter();


        String username = req.getParameter("");
        String password = req.getParameter("");










    }
}
