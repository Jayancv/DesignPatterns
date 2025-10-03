package behavioral.strategy;

public class CreditCardPayment implements IPaymentStrategy
{
    @Override public void pay()
    {
        System.out.println("Credit card validated and payment done.");
    }
}
