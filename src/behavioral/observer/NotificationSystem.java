package behavioral.observer;

public class NotificationSystem implements IObserver
{
    @Override
    public void update( String msg )
    {
        System.out.println( "Received " + msg + " message to Notification System." );

    }
}
