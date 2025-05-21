package creational.factory;

public class BookingGenerator {
    public static void main(String[] args) {
        IBookingItemFactory flightFactory = new FlightBookingItemFactory();
        AbstractBookingItem fltBooking = flightFactory.createBookingItem();
        fltBooking.calculateCostPrice();

        IBookingItemFactory hotelFactory = new HotelBookingItemFactory();
        AbstractBookingItem htlBooking = hotelFactory.createBookingItem();
        htlBooking.calculateCostPrice();
    }
}
