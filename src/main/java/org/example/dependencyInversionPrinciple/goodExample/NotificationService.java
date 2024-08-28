package org.example.dependencyInversionPrinciple.goodExample;

// High-level class depends on abstraction
public class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendNotification(String message) {
        notifier.send(message);
    }
}
