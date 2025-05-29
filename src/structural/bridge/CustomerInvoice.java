package structural.bridge;

public class CustomerInvoice extends Document{

    public CustomerInvoice(Notification notification) {
        super(notification);
    }

    @Override
    public void generateDocument() {
        System.out.println("Generating Customer Invoice Document");
        notification.sendNotification("Customer Invoice Document Generated", "");

    }
}
