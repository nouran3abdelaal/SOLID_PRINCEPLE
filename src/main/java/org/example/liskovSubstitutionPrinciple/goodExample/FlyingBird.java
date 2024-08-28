package org.example.liskovSubstitutionPrinciple.goodExample;

// Subclass for birds that can fly
public class FlyingBird extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
