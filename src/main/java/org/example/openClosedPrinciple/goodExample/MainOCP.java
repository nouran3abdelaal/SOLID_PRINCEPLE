package org.example.openClosedPrinciple.goodExample;

public class MainOCP {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle Area: " + calculator.calculateArea(circle));
        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
    }
}
