package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
    void addEmployee(Employee emp);
    String getInsuranceScheme(Employee emp);
    void displayEmployeeDetails(Employee emp);
}
