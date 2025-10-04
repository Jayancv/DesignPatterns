package behavioral.state;

public interface IState
{
    void performConfirm( Reservation reservation );

    void performCancel( Reservation reservation );

    void performAmendment( Reservation reservation );

}
