package behavioral.observer;

public class User implements IObserver
{
    @Override
    public void update( String msg )
    {
        System.out.println( "Received " + msg + " message to User." );

    }
}
