package behavioral.command;

public class ReservationClient
{
    public static void main( String[] args )
    {
        ReservationService reservationService = new ReservationService();
        ReservationInvoker invoker = new ReservationInvoker();

        CreateReservationCommand createReservationCommand = new CreateReservationCommand( reservationService );
        ModifyReservationCommand modifyReservationCommand = new ModifyReservationCommand( reservationService );
        CancelReservationCommand cancelReservationCommand = new CancelReservationCommand( reservationService );

        invoker.executeCommand( createReservationCommand );
        invoker.executeCommand( modifyReservationCommand );
        invoker.executeCommand( cancelReservationCommand );

    }
}
