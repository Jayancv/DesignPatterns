package behavioral.mediator;

public class ReservationDialog implements IMediatorDialog
{

    private TextBox customerName;
    private Button confirmButton;

    public TextBox getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName( TextBox customerName )
    {
        this.customerName = customerName;
    }

    public Button getConfirmButton()
    {
        return confirmButton;
    }

    public void setConfirmButton( Button confirmButton )
    {
        this.confirmButton = confirmButton;
    }

    @Override public void notify( Component component, String event )
    {
        if( component instanceof TextBox && component == customerName )
        {
            if( ( (TextBox) component ).getText() == null || ( (TextBox) component ).getText().isEmpty() )
            {
                System.out.println( "Need to set customer name" );
            }
        }
        else if( component instanceof Button && component == confirmButton )
        {
            if( customerName.getText() != null && !customerName.getText().isEmpty() )
            {
                System.out.println( "Reservation Confirmed" );
            }
            else
            {
                System.out.println( "Need to set customer name" );
            }
        }

    }
}
