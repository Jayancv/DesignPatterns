package structural.flyweight;

public class SeatReservation {
    ISeatType seatType;
    int seatNumber;
    String passengerName;
    String flightNumber;

    public SeatReservation(ISeatType seatType, int seatNumber, String passengerName, String flightNumber) {
        this.seatType = seatType;
        this.seatNumber = seatNumber;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
    }
    public String getSeatDetails() {
        return "Seat Number: " + seatNumber + ", Passenger: " + passengerName + ", Flight: " + flightNumber + ", Type: " + seatType.displaySeatType();
    }

}
