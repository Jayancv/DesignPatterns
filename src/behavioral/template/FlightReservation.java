package behavioral.template;

public class FlightReservation extends ReservationTemplate
{
    @Override
    boolean checkProduct()
    {
        System.out.println( "Send Amadeus search request" );
        return true;
    }

    @Override
    boolean checkProductAvailability()
    {
        System.out.println( "Send Amadeus avail request" );
        return true;
    }

    @Override
    boolean confirmSupplier()
    {
        System.out.println( "Send Amadeus confirm request" );
        return true;
    }
}
