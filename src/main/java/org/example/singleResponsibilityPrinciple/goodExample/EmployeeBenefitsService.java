package org.example.singleResponsibilityPrinciple.goodExample;

public class EmployeeBenefitsService {
    // Responsibilities =
    // 1- Benefits Management.
    public void addBenefits(Employee employee, String benefits) {
        // Code to add benefits
        System.out.println("Adding benefits for " + employee.getName());
    }

    public void removeBenefits(Employee employee) {
        // Code to remove benefits
        System.out.println("Removing benefits for " + employee.getName());
    }
}
