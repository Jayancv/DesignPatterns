package structural.facade;

public class ReservationHandler {
    public static void main(String[] args) {
        BookingFacade bookingFacade = new BookingFacade();
        bookingFacade.bookFlight("256A", "12A", "VISA");

    }
}
