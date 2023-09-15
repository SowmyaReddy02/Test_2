package org.example.model;

public class Employee {
    int empId;
    String name;
    double salary;
    int companyId;

    public Employee(int empId, String name, double salary, int companyId) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.companyId = companyId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
}
