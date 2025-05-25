package creational.builder;

public class BuilderClient {
    public static void main(String[] args) {
        ActivityTicket ticket = new ActivityTicket.ActivityTicketBuilder("Rome Tour", "ROMT1")
                .setCity("ROM").setOperator("GLOBUS").setPrice(104.00).build();
        System.out.println(ticket.toString());
    }
}
