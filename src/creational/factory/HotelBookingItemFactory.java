package creational.factory;

public class HotelBookingItemFactory implements IBookingItemFactory{
    @Override
    public AbstractBookingItem createBookingItem() {
        return new HotelBookingItem();
    }
}
