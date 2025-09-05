package behavioral.chainOfResponsibility;

public class ReservationClient
{
    public static void main( String[] args )
    {
        ReservationRequest request = new ReservationRequest( "ASD" ,"Jayan",1 );
        // Do a complete booking
        ConfirmationHandler confirmationHandler = new ConfirmationHandler( null );
        PaymentHandler paymentHandler = new PaymentHandler( confirmationHandler );
        AvailabilityHandler availabilityHandler = new AvailabilityHandler( paymentHandler  );

        availabilityHandler.handleRequest( request );

        // Do a quote; No payment or confirmation
        AvailabilityHandler availabilityHandler1 = new AvailabilityHandler( null  );
        availabilityHandler1.handleRequest( request );

        // Do a post paid booking; No payment upfront
        ConfirmationHandler confirmationHandler2 = new ConfirmationHandler( null );
        AvailabilityHandler availabilityHandler2 = new AvailabilityHandler( confirmationHandler2  );
        availabilityHandler2.handleRequest( request );

    }
}
