package org.example.singleResponsibilityPrinciple.goodExample;

public class EmployeePromotionService {
    // Responsibilities =
    // 1- promotions and demotions changes
    public void promote(Employee employee) {
        System.out.println(employee.getName() + " has been promoted.");
        employee.setPosition("Senior " + employee.getPosition());
    }

    public void demote(Employee employee) {
        System.out.println(employee.getName() + " has been demoted.");
        employee.setPosition(employee.getPosition().replace("Senior ", ""));
    }
}
