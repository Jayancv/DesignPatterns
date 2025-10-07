package behavioral.memento;

import java.util.Stack;

public class ReservationHistory
{
    private final Stack<ReservationMemento> history = new Stack<>();

    public void save( Reservation reservation )
    {
        history.push( reservation.save() );
    }

    public void undo( Reservation reservation )
    {
        if( !history.isEmpty() )
        {
            ReservationMemento memento = history.pop();
            reservation.restore( memento );
        }
    }
}

