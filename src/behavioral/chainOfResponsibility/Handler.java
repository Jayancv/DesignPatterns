package behavioral.chainOfResponsibility;

public abstract class Handler implements IHandler
{
    private Handler nextHandler;

    public Handler (Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public boolean handleNext(ReservationRequest request){
        if(nextHandler != null) {
            return nextHandler.handleRequest( request );
        }
        return true;
    }

}
