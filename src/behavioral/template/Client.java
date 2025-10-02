package behavioral.template;

public class Client
{
    public static void main( String[] args )
    {
        HotelReservation hotelReservation = new HotelReservation();
        FlightReservation flightReservation = new FlightReservation();

        System.out.println( "--Flight booking--" );
        flightReservation.makeReservation();

        System.out.println( "--Hotel booking--" );
        hotelReservation.makeReservation();
    }
}
