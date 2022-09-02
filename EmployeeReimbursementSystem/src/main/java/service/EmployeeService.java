package service;

import data.HttpServlet;
import data.HttpServletRequest;
import data.HttpServletResponse;
import entity.Employee;
import entity.Manager;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class EmployeeService<ObjectMapper> extends HttpServlet {

    public static Employee updateEmployee(Employee employee) {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws exception, IOException{
        PrintWriter out  = resp.getWriter();
        ManagerService EmployeeService = new ManagerService();

        ObjectMapper mapper = new ObjectMapper();

        Manager manager;

        try{

            manager = mapper.readValue(req.getReader(), Person.class);
        }catch(Exception e) {
            e.printStackTrace();
            resp.sendError(400,"invalid employee format");
        }

            ManagerService.in
    }



    public static boolean deleteEmployee(int idInteger) {

        return false;
    }

    public List<Employee> getAllEmployees() {
    }
}
