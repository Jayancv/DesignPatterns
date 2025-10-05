package behavioral.visitor;

public class HotelBooking implements IBookingItem
{
    private double price = 0;

    public HotelBooking( double price )
    {
        this.price = price;
    }

    @Override public double getPrice()
    {
        return price;
    }

    @Override public String getDescription()
    {
        return "Hotel booking with price of :" + price;
    }

    @Override
    public void accept( IBookingItemVisitor visitor )
    {
        visitor.visit( this );
    }
}
