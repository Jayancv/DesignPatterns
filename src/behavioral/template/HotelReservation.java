package behavioral.template;

public class HotelReservation extends ReservationTemplate
{

    @Override
    boolean checkProduct()
    {
        System.out.println( "Send HotelBed search request" );
        return true;
    }

    @Override
    boolean checkProductAvailability()
    {
        System.out.println( "Send HotelBed avail request" );
        return true;
    }

    @Override
    boolean confirmSupplier()
    {
        System.out.println( "Send HotelBed confirm request" );
        return true;
    }


}
