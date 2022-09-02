package data;

import java.io.PrintWriter;

public interface HttpServletResponse {
    void getContentType();

    PrintWriter getWriter();

    void setContentType(String s);

    void sendError(int i, String must_include_id);
}
