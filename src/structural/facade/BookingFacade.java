package structural.facade;

public class BookingFacade {

    public boolean bookFlight(String flightNumber, String seatNumber, String paymentMethod) {
        // Create instances of the services
        PaymentService paymentService = new PaymentService();
        SeatReservationService seatReservationService = new SeatReservationService();
        NotificationService notificationService = new NotificationService();

        // Hold the seat
        boolean isSeatHeld = seatReservationService.holdSeat(seatNumber);

        if (!isSeatHeld) {
            System.out.println("Failed to hold the seat.");
            return false;
        }

        // Process the payment
        boolean isPaymentSuccessful = paymentService.processPayment(paymentMethod, 199.99);

        if (!isPaymentSuccessful) {
            System.out.println("Payment failed. Please try again.");
            return false;
        }

        System.out.println("Flight " + flightNumber + " booked successfully with seat " + seatNumber + ".");

        // Send a notification
        notificationService.sendNotification("Your flight " + flightNumber + " has been booked successfully with seat " + seatNumber + ".");

        return true;
    }
}
