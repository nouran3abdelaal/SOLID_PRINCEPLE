package org.example.dependencyInversionPrinciple.badExample;

// High-level class that directly depends on the low-level class
public class NotificationService {
    private EmailSender emailSender;

    public NotificationService() {
        this.emailSender = new EmailSender();
    }

    public void sendNotification(String message) {
        emailSender.sendEmail(message);
    }
}
