package domina.dao;

import domain.Employee;

public class EmployeeDAO {

    public void saveEmployee(Employee employee) {

//        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance ( );
//        connectionManager.connect ( );
//        connectionManager.getConnectionObject ( );
//        connectionManager.disconnect ( );
        System.out.println ( "Save employee to the Database: " + employee );

    }

    public void deleteEmployee(Employee employee) {

        System.out.println ( "Delete employee to the Database: " + employee );

    }
}
