package org.example.singleResponsibilityPrinciple.badExample.stage2;

public class Employee {
    // Responsibilities =
    // 1- representing the data of an employee
    private String name;
    private String position;
    private double salary;

    // Constructor
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
