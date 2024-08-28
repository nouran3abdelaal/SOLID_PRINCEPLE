package org.example.interfaceSegregationPrinciple.badExmple;

// Class that implements all methods but cannot work
public class Human implements Worker {
    @Override
    public void work() {
        System.out.println("Human is working");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }
}
