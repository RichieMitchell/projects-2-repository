package controller;

import data.HttpServletRequest;
import entity.Employee;

import java.io.IOException;

public class GetEmployeeController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        int moreEmployee = Integer.parseInt(request.getParameter("aid"));
        Employee a1 = new Employee();


    }
}
