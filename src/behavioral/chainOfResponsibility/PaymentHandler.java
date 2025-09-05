package behavioral.chainOfResponsibility;

public class PaymentHandler extends Handler
{

    public PaymentHandler( Handler nextHandler )
    {
        super( nextHandler );
    }

    @Override public boolean handleRequest( ReservationRequest request )
    {
        boolean paymentReceived = true;
        if(paymentReceived){
            System.out.println("Payment received.");
            return  handleNext( request );
        }
        else {
            System.out.println("Payment failed.");
            return false;
        }
    }
}
