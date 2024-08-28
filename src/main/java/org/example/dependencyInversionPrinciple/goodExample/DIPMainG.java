package org.example.dependencyInversionPrinciple.goodExample;

// Usage
public class DIPMainG {
    public static void main(String[] args) {
        Notifier emailSender = new EmailSender();
        NotificationService emailNotificationService = new NotificationService(emailSender);
        emailNotificationService.sendNotification("Hello, World!"); // Output: Sending email: Hello, World!

        Notifier smsSender = new SmsSender();
        NotificationService smsNotificationService = new NotificationService(smsSender);
        smsNotificationService.sendNotification("Hello, World!"); // Output: Sending SMS: Hello, World!
    }
}
