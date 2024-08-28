package org.example.openClosedPrinciple.badExample;

public class AreaCalculator {
    public double calculateArea(String shape, double... dimensions) {
        switch (shape) {
            case "circle" -> {
                double radius = dimensions[0];
                return Math.PI * radius * radius;
            }
            case "rectangle" -> {
                double width = dimensions[0];
                double height = dimensions[1];
                return width * height;
            }
            default -> throw new IllegalArgumentException("Unknown shape: " + shape);
        }
    }
}
