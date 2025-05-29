package structural.facade;

public class NotificationService {
    public void sendNotification(String message) {
        // Simulate sending a notification
        System.out.println("Notification sent: " + message);
    }

    public void sendEmail(String email, String subject, String body) {
        // Simulate sending an email
        System.out.println("Email sent to " + email + " with subject: " + subject);
    }

    public void sendSMS(String phoneNumber, String message) {
        // Simulate sending an SMS
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }
}
