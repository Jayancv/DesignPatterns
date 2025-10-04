package behavioral.state;

public class CancelState implements IState
{
    @Override public void performConfirm(Reservation reservation)
    {
        System.out.println("Reservation Already cancelled. Can not confirm");
    }

    @Override public void performCancel(Reservation reservation)
    {
        System.out.println("Reservation Already cancelled");
    }

    @Override public void performAmendment(Reservation reservation)
    {
        System.out.println("Reservation Already cancelled. Can not Update");
    }
}
