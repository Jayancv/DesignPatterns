package behavioral.observer;

public class Reservation extends IObservable
{

    String msg = "";

    public void createReservation()
    {
        msg = "Reservation Created";
        System.out.println( msg );
        notifyObservers();
    }

    public void updateReservation()
    {

        msg = "Reservation Updated";
        System.out.println( msg );
        notifyObservers();
    }

    public void cancelReservation()
    {
        msg = "Reservation Cancelled";
        System.out.println( msg );
        notifyObservers();
    }

    @Override
    public void notifyObservers()
    {
        for( IObserver observer : observers )
        {
            observer.update( msg );
        }
    }
}
