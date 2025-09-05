package behavioral.chainOfResponsibility;

public class AvailabilityHandler extends Handler
{
    public AvailabilityHandler( Handler nextHandler )
    {
        super( nextHandler );
    }


    @Override public boolean handleRequest( ReservationRequest request )
    {
        boolean availabilityCheck = true;
        if(availabilityCheck){
            System.out.println("Availability check success.");
            return  handleNext( request );
        }
        else {
            System.out.println("Availability check failed.");
            return false;
        }
    }
}
