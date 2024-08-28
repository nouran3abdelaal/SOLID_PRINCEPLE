package org.example.interfaceSegregationPrinciple.badExmple;

// Usage
public class ISPMain {
    public static void main(String[] args) {
        Worker robot = new Robot();
        Worker human = new Human();

        robot.work(); // Output: Robot is working
        try {
            robot.eat(); // Throws UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage()); // Output: Robot does not eat
        }

        human.work(); // Output: Human is working
        human.eat(); // Output: Human is eating
    }
}
