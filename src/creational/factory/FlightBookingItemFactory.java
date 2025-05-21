package creational.factory;

public class FlightBookingItemFactory implements IBookingItemFactory{

    @Override
    public AbstractBookingItem createBookingItem() {
        return new FlightBookingItem();
    }
}
