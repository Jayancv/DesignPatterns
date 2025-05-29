package structural.decorator;

public class InsuranceDecorator extends TicketDecorator {

    public InsuranceDecorator(ITicket ticket) {
        super(ticket);
    }

    @Override
    public String getDescription() {
        return ticket.getDescription() + " with Insurance";
    }

    @Override
    public double getPrice() {
        return ticket.getPrice() + 10; // Assuming insurance adds a fixed price of 10
    }

    @Override
    public double getCost() {
        return ticket.getCost() + 5; // Assuming insurance adds a fixed cost of 5
    }
}
