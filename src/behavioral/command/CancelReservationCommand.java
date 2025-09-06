package behavioral.command;

public class CancelReservationCommand implements ICommand
{
    private ReservationService service;

    public CancelReservationCommand( ReservationService service )
    {
        this.service = service;
    }

    @Override public void execute()
    {
        service.cancelReservation();
    }
}
