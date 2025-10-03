package behavioral.strategy;

public class Client
{
    public static void main( String[] args )
    {
        PaymentRequest paymentRequest = new PaymentRequest( new CreditCardPayment() );
        paymentRequest.performPayment();

        PaymentRequest paymentRequest2 = new PaymentRequest( new BankTransferPayment() );
        paymentRequest2.performPayment();

        PaymentRequest paymentRequest3 = new PaymentRequest( new PayPalPayment() );
        paymentRequest3.performPayment();

    }

}
