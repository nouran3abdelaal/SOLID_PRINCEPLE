package org.example.interfaceSegregationPrinciple.badExmple;

// Class that implements all methods but cannot eat
public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot does not eat");
    }
}
