package org.example.singleResponsibilityPrinciple.goodExample;

public class EmployeeWorkService {
    // Responsibilities =
    // 1- mange work activities
    public void work(Employee employee) {
        System.out.println(employee.getName() + " is working.");
    }

    public void takeBreak(Employee employee) {
        System.out.println(employee.getName() + " is taking a break.");
    }
}
