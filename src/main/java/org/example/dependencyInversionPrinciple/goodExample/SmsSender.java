package org.example.dependencyInversionPrinciple.goodExample;

// Another low-level class that implements the abstraction
public class SmsSender implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
