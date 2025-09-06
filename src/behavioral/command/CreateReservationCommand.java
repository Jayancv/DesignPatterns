package behavioral.command;

public class CreateReservationCommand implements ICommand
{
    private ReservationService service;

    public CreateReservationCommand( ReservationService service )
    {
        this.service = service;
    }

    @Override public void execute()
    {
        service.createReservation();
    }
}
