package org.example.singleResponsibilityPrinciple.badExample.stage2;

import org.example.singleResponsibilityPrinciple.badExample.stage1.Employee;

public class EmployeeService {
    // Responsibilities =
    //  1- mange work activities
    //  2- promotions and demotions changes
    //  3- salary adjustments changes.
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
