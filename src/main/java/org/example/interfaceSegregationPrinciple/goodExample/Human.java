package org.example.interfaceSegregationPrinciple.goodExample;

// Class that implements both work and eat functionality
public class Human implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Human is working");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }
}
