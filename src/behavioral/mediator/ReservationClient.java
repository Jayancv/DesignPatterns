package behavioral.mediator;

public class ReservationClient
{
    public static void main( String[] args )
    {
        ReservationDialog dialog = new ReservationDialog();
        TextBox customerName = new TextBox( dialog );
        Button confirmButton = new Button( dialog );

        dialog.setConfirmButton( confirmButton );
        dialog.setCustomerName( customerName );

        confirmButton.click();
        customerName.setText( "Jayan" );
        confirmButton.click();
    }
}
