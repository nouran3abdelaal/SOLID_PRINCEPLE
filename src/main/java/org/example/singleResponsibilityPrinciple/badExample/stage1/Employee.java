package org.example.singleResponsibilityPrinciple.badExample.stage1;

public class Employee {
    // Responsibilities =
    // 1- representing the data of an employee
    // 2- mange work activities
    // 3- promotions and demotions changes
    // 4- salary adjustments changes.
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
   public void work(Employee employee) {
        System.out.println(employee.getName() + " is working.");
    }

    public void takeBreak(Employee employee) {
        System.out.println(employee.getName() + " is taking a break.");
    }


    public void promote(Employee employee) {
        System.out.println(employee.getName() + " has been promoted.");
        employee.setPosition("Senior " + employee.getPosition());
    }

    public void demote(Employee employee) {
        System.out.println(employee.getName() + " has been demoted.");
        employee.setPosition(employee.getPosition().replace("Senior ", ""));
    }

    public void giveRaise(Employee employee, double amount) {
        double newSalary = employee.getSalary() + amount;
        employee.setSalary(newSalary);
        System.out.println(employee.getName() + " got a raise. New salary: " + newSalary);
    }

    public void deductSalary(Employee employee, double amount) {
        double newSalary = employee.getSalary() - amount;
        employee.setSalary(newSalary);
        System.out.println(employee.getName() + " got a deduction. New salary: " + newSalary);
    }
}
