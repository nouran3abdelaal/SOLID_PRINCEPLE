package org.example.dependencyInversionPrinciple.goodExample;

// Low-level class that implements the abstraction
public class EmailSender implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
