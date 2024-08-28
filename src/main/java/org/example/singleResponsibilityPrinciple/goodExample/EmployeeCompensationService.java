package org.example.singleResponsibilityPrinciple.goodExample;

public class EmployeeCompensationService {
    // Responsibilities =
    // 1- salary adjustments changes.
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
//    public void addBenefits(Employee employee, String benefits) {
//        // Code to add benefits
//        System.out.println("Adding benefits for " + employee.getName());
//    }
//
//    public void removeBenefits(Employee employee) {
//        // Code to remove benefits
//        System.out.println("Removing benefits for " + employee.getName());
//    }
}
