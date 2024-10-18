package com.cg.eis.bean;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    // Constructor
    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = determineInsuranceScheme(salary, designation);
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        this.insuranceScheme = determineInsuranceScheme(salary, this.designation); // Update scheme if salary changes
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
        this.insuranceScheme = determineInsuranceScheme(this.salary, designation); // Update scheme if designation changes
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    private String determineInsuranceScheme(double salary, String designation) {
        if (salary > 50000 && designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        } else if (salary >= 20000 && salary <= 50000 && designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        } else if (salary >= 5000 && salary < 20000 && designation.equalsIgnoreCase("Clerk")) {
            return "Scheme C";
        } else {
            return "No Scheme";
        }
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + 
               ", designation=" + designation + ", insuranceScheme=" + insuranceScheme + "]";
    }
}
