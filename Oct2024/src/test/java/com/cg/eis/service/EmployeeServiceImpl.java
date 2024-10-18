package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void addEmployee(Employee emp) {
        System.out.println("Employee added successfully: " + emp);
    }

    @Override
    public String getInsuranceScheme(Employee emp) {
        return emp.getInsuranceScheme();
    }

    @Override
    public void displayEmployeeDetails(Employee emp) {
        System.out.println(emp);
    }
}
