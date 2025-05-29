package structural.facade;

public class SeatReservationService {

    public boolean holdSeat(String seatNumber) {
        // Logic to hold a seat
        System.out.println("Seat " + seatNumber + " has been held.");
        return true;
    }
}
