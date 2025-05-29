package structural.bridge;

public class SupplierInvoice extends Document{

    public SupplierInvoice(Notification notification) {
        super(notification);
    }

    @Override
    public void generateDocument() {
        System.out.println("Generating Supplier Invoice Document");
        notification.sendNotification("Supplier Invoice Document Generated", "");
    }
}
