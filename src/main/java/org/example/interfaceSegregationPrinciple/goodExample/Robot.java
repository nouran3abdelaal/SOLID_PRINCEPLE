package org.example.interfaceSegregationPrinciple.goodExample;

// Class that implements only work functionality
public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}
