package behavioral.state;

public class ReservationClient
{
    public static void main( String[] args )
    {

        Reservation reservation = new Reservation();
        reservation.amendReservation();
        reservation.confirmReservation();
        reservation.confirmReservation();
        reservation.cancelReservation();
        reservation.amendReservation();
        reservation.cancelReservation();
        reservation.confirmReservation();
    }


}
