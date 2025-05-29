package structural.bridge;

public class SMSNotification implements Notification{
    @Override
    public void sendNotification(String message, String recipient) {
        // Logic to send an SMS notification
        System.out.println("Sending SMS Notification to " + recipient + ": " + message);
    }
}
