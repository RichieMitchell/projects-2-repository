package data;

import entity.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class employeedaoimpl {


@Override
    public Employee insert(Employee employee) {

    String sql = "insert into Employees(id, username, password, manager) values(defautl, ?, ?, ?);";
    try {

        Connection connection;
        PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        PreparedStatement.setString(1, employee.getUserName());
        PreparedStatement.setString(2, employee.getPassword());
        PreparedStatement.setString(3, employee.isManager());

        // this inserts the statement into the database
        int count = preparedStatement.executeUpdate();

        if (count == 1) {
            System.out.println("Employee added succesfully.");

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            resultSet.next();

            int generateId = resultSet.getInt(1);
            employee.setId(generateId);
        } else {
            System.out.println("Something went wrong with the insert!");
        }

    } catch (SQLEXCEPTION e) {
        e.printStackTrace();
        System.out.println("Something preparing the statement");
    }
    return employee;

}
}






}
