package behavioral.command;

public class ReservationInvoker
{
    public void executeCommand(ICommand command){
        command.execute();
    }
}
