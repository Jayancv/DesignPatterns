package behavioral.state;

public class NewState implements IState
{

    @Override public void performConfirm(Reservation reservation)
    {
        System.out.println("Reservation Confirmed");
        reservation.setState( new  ConfirmState());
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
