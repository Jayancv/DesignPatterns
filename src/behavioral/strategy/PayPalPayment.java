package behavioral.strategy;

public class PayPalPayment implements IPaymentStrategy
{
    @Override public void pay()
    {
        System.out.println("Connected to PayPal account and payment done.");
    }
}
