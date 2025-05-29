package structural.decorator;

public class MealDecorator extends TicketDecorator {

    public MealDecorator(ITicket ticket) {
        super(ticket);
    }

    @Override
    public String getDescription() {
        return ticket.getDescription() + " with Meal";
    }

    @Override
    public double getPrice() {
        return ticket.getPrice() + 20; // Assuming meal adds a fixed price of 20
    }

    @Override
    public double getCost() {
        return ticket.getCost() + 10; // Assuming meal adds a fixed cost of 10
    }
}
