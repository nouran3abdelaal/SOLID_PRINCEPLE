package org.example.dependencyInversionPrinciple.badExample;

// Usage
public class DIPMain {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Hello, World!"); // Output: Sending email: Hello, World!
    }
}
