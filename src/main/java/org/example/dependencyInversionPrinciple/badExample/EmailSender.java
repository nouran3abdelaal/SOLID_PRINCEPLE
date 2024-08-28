package org.example.dependencyInversionPrinciple.badExample;

// Low-level class
public class EmailSender {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}

