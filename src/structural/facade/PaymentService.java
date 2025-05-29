package structural.facade;

public class PaymentService {
    public boolean processPayment(String paymentMethod, double amount) {
        // Logic to process payment
        System.out.println("Processing " + paymentMethod + " payment of $" + amount);
        return true; // Assume payment is successful
    }
}
