package structural.bridge;

public class DocumentGenerator {
    public static void main(String[] args) {
        // Create a PDF document with SMS notification
        Document supplierInvoice = new SupplierInvoice(new SMSNotification());
        supplierInvoice.generateDocument();

        // Create a CustomerInvoice with Email notification
        Document customerInvoice = new CustomerInvoice(new EmailNotification());
        customerInvoice.generateDocument();

    }
}
