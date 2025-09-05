package behavioral.chainOfResponsibility;

public class ConfirmationHandler extends Handler
{

    public ConfirmationHandler( Handler nextHandler )
    {
        super( nextHandler );
    }

    @Override public boolean handleRequest( ReservationRequest request )
    {
        boolean supplierConfirmed = true;
        if(supplierConfirmed){
            System.out.println("Supplier confirmed.");
            return  handleNext( request );
        }
        else {
            System.out.println("Supplier Confirmation failed.");
            return false;
        }
    }
}
