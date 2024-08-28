package org.example.liskovSubstitutionPrinciple.badExample;

// Subclass
public class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("Penguins cannot fly");
    }
}
