package structural.decorator;

public abstract class TicketDecorator implements ITicket{

    protected ITicket ticket;

    public TicketDecorator(ITicket ticket) {
        this.ticket = ticket;
    }

}
