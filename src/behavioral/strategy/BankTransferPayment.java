package behavioral.strategy;

public class BankTransferPayment implements IPaymentStrategy
{
    @Override public void pay()
    {
        System.out.println("Bank transfer validated and payment done.");

    }
}
