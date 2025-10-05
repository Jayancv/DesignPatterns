package behavioral.visitor;

public class VisitorClient
{
    public static void main( String[] args )
    {
        CalculateTotal calculator = new CalculateTotal();
        DocumentGenerator documentGenerator = new DocumentGenerator();

        HotelBooking htl = new HotelBooking( 15 );
        FlightBooking flt = new FlightBooking( 12 );

        calculator.visit( htl );
        calculator.visit( flt );
        System.out.println(calculator.getTotal());

        documentGenerator.visit( flt );
        documentGenerator.visit( htl );
        System.out.println(documentGenerator.getDoc());

    }
}
