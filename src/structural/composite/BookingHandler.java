package structural.composite;

public class BookingHandler {

    public static void main(String[] args) {

        Booking booking = new Booking();
        booking.setCost(1000);
        booking.setPrice(1200);

        BookingItem flight = new BookingItem();
        flight.setCost(800);
        flight.setPrice(1000);
        flight.addItemSupplement(new Supplement(100, 150, 0, 0));

        BookingItem hotel = new BookingItem();
        hotel.setCost(200);
        hotel.setPrice(300);
        hotel.addItemSupplement(new Supplement(30, 50, 0, 0));

        booking.addBookingItem(flight);
        booking.addBookingItem(hotel);
        booking.addBookingSupplement(new Supplement(40, 50, 0, 0));
        booking.addBookingSupplement(new Supplement(50, 60, 0, 0));

        System.out.println("Total Cost: " + booking.calculateCost());
        System.out.println("Total Price: " + booking.calculatePrice());
    }
}
