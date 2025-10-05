package behavioral.visitor;

public class FlightBooking implements IBookingItem
{
    private double price = 0;

    public FlightBooking( double price )
    {
        this.price = price;
    }

    @Override public double getPrice()
    {
        return price;
    }

    @Override public String getDescription()
    {
        return "Flight booking with price of :" + price;
    }

    @Override public void accept( IBookingItemVisitor visitor )
    {
        visitor.visit( this );

    }
}
