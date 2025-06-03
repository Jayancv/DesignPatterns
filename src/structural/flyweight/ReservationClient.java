package structural.flyweight;

public class ReservationClient {
    public static void main(String[] args) {
        // Create seat reservations
        SeatReservation reservation1 = new SeatReservation(SeatTypeFactory.getSeatType("Economy", "Window"), 12, "Alice", "FL123");
        SeatReservation reservation2 = new SeatReservation(SeatTypeFactory.getSeatType("Business", "Aisle"), 5, "Bob", "FL456");
        SeatReservation reservation3 = new SeatReservation(SeatTypeFactory.getSeatType("Economy", "Window"), 14, "Charlie", "FL123");
        SeatReservation reservation4 = new SeatReservation(SeatTypeFactory.getSeatType("Business", "Window"), 15, "Jack", "FL123");

        // Display seat details
        System.out.println(reservation1.getSeatDetails());
        System.out.println(reservation2.getSeatDetails());
        System.out.println(reservation3.getSeatDetails());
        System.out.println(reservation4.getSeatDetails());
    }
}
