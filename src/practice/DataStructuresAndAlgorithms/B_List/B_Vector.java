package practice.DataStructuresAndAlgorithms.B_List;

import practice.DataStructuresAndAlgorithms.Employee;

import java.util.List;
import java.util.Vector;

public class B_Vector {

    // Vector is SYNCHRONIZED unlike ArrayList
    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
    }
}