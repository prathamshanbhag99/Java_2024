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

        scanner.nextLine(); 

        System.out.println("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        scanner.nextLine(); /

        System.out.println("Enter Employee Designation: ");
        String designation = scanner.nextLine();

        
        Employee employee = new Employee(id, name, salary, designation);

        
        empService.addEmployee(employee);

        
        empService.displayEmployeeDetails(employee);

     
        System.out.println("Insurance Scheme: " + empService.getInsuranceScheme(employee));

        scanner.close();
    }
}
