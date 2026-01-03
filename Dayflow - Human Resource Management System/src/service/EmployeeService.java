package service;

import model.Employee;
import java.util.ArrayList;

public class EmployeeService {

    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void addEmployee(Employee e) {
        employees.add(e);
    }

    public static void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found");
            return;
        }

        for (Employee e : employees) {
            System.out.println(
                "ID: " + e.id +
                ", Name: " + e.name +
                ", Email: " + e.email
            );
        }
    }
}
