package behavioral.observer;

public class Client
{
    public static void main( String[] args )
    {
        Reservation reservation = new Reservation();
        User user1 = new User();
        User user2 = new User();
        NotificationSystem notificationSystem = new NotificationSystem();
        reservation.addObservers( user1 );
        reservation.addObservers( user2 );
        reservation.addObservers( notificationSystem );

        reservation.createReservation();
        reservation.updateReservation();
        reservation.cancelReservation();
    }
}
