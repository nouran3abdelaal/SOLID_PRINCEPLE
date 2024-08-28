package org.example.interfaceSegregationPrinciple.goodExample;

// Usage
public class ISPMainG {
    public static void main(String[] args) {
        Workable robot = new Robot();
        Workable humanWorkable = new Human();
        Eatable humanEatable = new Human();

        robot.work(); // Output: Robot is working
        humanWorkable.work(); // Output: Human is working
        humanEatable.eat(); // Output: Human is eating
    }
}
