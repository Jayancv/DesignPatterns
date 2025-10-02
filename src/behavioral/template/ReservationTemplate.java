package behavioral.template;

public abstract class ReservationTemplate
{
    public void makeReservation()
    {
        boolean valid = false;
        valid = checkProduct();
        if( !valid )
        {
            return;
        }
        valid = checkProductAvailability();
        if( !valid )
        {
            return;
        }
        valid = confirmSupplier();
        if( !valid )
        {
            return;
        }
        valid = collectPayment();
        if( !valid )
        {
            return;
        }
        valid = confirmationNotification();

        if( !valid )
        {
            return;
        }
    }


    abstract boolean checkProduct();

    abstract boolean checkProductAvailability();

    abstract boolean confirmSupplier();

    public boolean collectPayment()
    {
        System.out.println( "Payment collected" );
        return true;
    }

    public boolean confirmationNotification()
    {
        System.out.println( "Reservation confirmed." );
        return true;
    }

}
