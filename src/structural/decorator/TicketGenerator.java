package structural.decorator;

public class TicketGenerator {
    public static void main(String[] args) {
        ITicket ticket = new ActivityTicket();
        System.out.println("Ticket Description: " + ticket.getDescription());
        System.out.println("Ticket Price: " + ticket.getPrice());

        // adding insurance
        ticket = new InsuranceDecorator(ticket);
        System.out.println("Ticket Description: " + ticket.getDescription());
        System.out.println("Ticket Price: " + ticket.getPrice());

        // adding meal
        ticket = new MealDecorator(ticket);
        System.out.println("Ticket Description: " + ticket.getDescription());
        System.out.println("Ticket Price: " + ticket.getPrice());

    }
}
