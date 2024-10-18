package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;
import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService empService = new EmployeeServiceImpl();

        System.out.println("Enter Employee ID: ");
        int id = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.println("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        scanner.nextLine(); // Consume newline

        System.out.println("Enter Employee Designation: ");
        String designation = scanner.nextLine();

        // Create Employee object
        Employee employee = new Employee(id, name, salary, designation);

        // Add Employee
        empService.addEmployee(employee);

        // Display Employee details and insurance scheme
        empService.displayEmployeeDetails(employee);

        // Display insurance scheme
        System.out.println("Insurance Scheme: " + empService.getInsuranceScheme(employee));

        scanner.close();
    }
}
