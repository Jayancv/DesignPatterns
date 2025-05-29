package structural.bridge;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification(String message, String recipient) {
        // Logic to send an email notification
        System.out.println("Sending Email Notification to " + recipient + ": " + message);
    }
}
