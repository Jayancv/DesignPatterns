package behavioral.memento;

public class ReservationCreator
{
    public static void main( String[] args )
    {
        ReservationHistory history = new ReservationHistory();
        Reservation reservation = new Reservation();
        history.save( reservation );

        reservation.addItem( new Item( "HTL", "Hilton", 80.00 ) );
        reservation.addItem( new Item( "FLT", "HEL-BER", 120.00 ) );
        System.out.println( reservation );
        history.save( reservation );

        reservation.addItem( new Item( "HTL", "Cinnamon", 85.00 ) );
        history.save( reservation );
        System.out.println( reservation );

        reservation.addItem( new Item( "TOU", "Berlin Tour", 25.00 ) );
        history.save( reservation );
        System.out.println( reservation );

        history.undo( reservation );
        System.out.println( reservation );

        history.undo( reservation );
        System.out.println( reservation );

        history.undo( reservation );
        System.out.println( reservation );

    }
}
