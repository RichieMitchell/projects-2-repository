//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package controller.ServletSection;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.servlet.GenericServlet;

import data.HttpServlet;
import data.HttpServletRequest;
import data.HttpServletResponse;
import service.EmployeeService;

import entity.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Iterator;
import java.util.List;


public class employeeservlet1<ObjectMapper> extends HttpServlet {
    public employeeservlet1() {
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int personId = (Integer)req.getSession().getAttribute("id");
        System.out.println("Id from session: " + personId);
        String user = req.getParameter("username");
        System.out.println(user);
        String pathInfo = req.getPathInfo();
        System.out.println("Path info: " + pathInfo);
        EmployeeService petService = new EmployeeService() {
            public String getName() {
                return null;
            }

            public URL getURL() {
                return null;
            }

            public URL getCodeSourceURL() {
                return null;
            }

            public InputStream getInputStream() throws IOException {
                return null;
            }

            public int getContentLength() throws IOException {
                return 0;
            }
        };
        PrintWriter out = resp.getWriter();
        Employee employee;
        boolean Employee = false;
        if (pathInfo == null) {
            List<Employee> resource = petService.getAllEmployees();
            Iterator var9 = resource.iterator();

            while(var9.hasNext()) {
                entity.Employee manager = (Employee) var9.next();
                out.println(Employee);
            }
        } else {
            String id = pathInfo.substring(1);
            int idInteger = Integer.parseInt(id);
            Object EmployeeCounter = null;
            Object employee = EmployeeCounter.getById(idInteger);
            out.println(Employee);
        }

    }

    protected <EmployeeService> void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        EmployeeService EmployeeService = new EmployeeService();
        ObjectMapper mapper = new ObjectMapper();

        Employee employee;
        try {
            employee = (Employee)mapper.readValue(req.getReader(), Employee.class);
        } catch (Exception var8) {
            var8.printStackTrace();
            resp.sendError(400, "Invalid pet format");
            return;
        }

        StringBuffer employeeService = null;
        employee = employeeService.insert(employee);
        out.println(employee);
    }

    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        EmployeeService petService = new EmployeeService();
        ObjectMapper mapper = new ObjectMapper();

        Employee employee;
        try {
            employee = (Employee)mapper.readValue(req.getReader(), Pet.class);
        } catch (Exception var8) {
            var8.printStackTrace();
            resp.sendError(400, "Invalid pet format");
            return;
        }

        employee= EmployeeService.updateEmployee(employee);
        out.println(employee);
    }

    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EmployeeService petService = new EmployeeService();
        PrintWriter out = resp.getWriter();
        String pathInfo = req.getPathInfo();
        if (pathInfo == null) {
            resp.sendError(400, "Must include id");
        } else {
            String id = pathInfo.substring(1);
            int idInteger = Integer.parseInt(id);
            boolean success = EmployeeService.deleteEmployee(idInteger);
            if (success) {
                out.write("Deletion successful!");
            } else {
                resp.sendError(400, "Deletion unsuccessful, perhaps id doesn't exist?");
            }

        }
    }
}
