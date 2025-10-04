package behavioral.state;

public class ConfirmState implements IState
{
    @Override public void performConfirm(Reservation reservation)
    {
        System.out.println("Reservation already Confirmed");
    }

    @Override public void performCancel(Reservation reservation)
    {
        System.out.println("Reservation cancelled");
        reservation.setState( new CancelState());
    }

    @Override public void performAmendment(Reservation reservation)
    {
        System.out.println("Reservation Updated");
    }
}
