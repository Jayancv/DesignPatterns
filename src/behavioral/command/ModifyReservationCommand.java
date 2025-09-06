package behavioral.command;

public class ModifyReservationCommand implements ICommand
{
    private ReservationService service;

    public ModifyReservationCommand( ReservationService service )
    {
        this.service = service;
    }

    @Override public void execute()
    {
        service.modifyReservation();
    }
}
