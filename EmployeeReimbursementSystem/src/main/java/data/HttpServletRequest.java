package data;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileStore;

public interface HttpServletRequest {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String attachment = request.getParameter("attachement");
        String foo = request.getParameter("foo");
        // get other parameters from the request
        // and get the attachment file
    }

    String getParameter(String foo);

    <Cookie> Cookie[] getCookies();

    FileStore getSession();

    String getPathInfo();

    Object getReader();

    PrintWriter getWriter();
}
