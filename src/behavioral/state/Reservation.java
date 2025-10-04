package behavioral.state;


// Context
public class Reservation
{
    private IState state;

    public Reservation()
    {
        state = new NewState();
    }

    public void setState( IState state )
    {
        this.state = state;
    }

    public void confirmReservation()
    {
        state.performConfirm( this );
    }

    public void amendReservation()
    {
        state.performAmendment( this );
    }

    public void cancelReservation()
    {
        state.performCancel( this );
    }
}
