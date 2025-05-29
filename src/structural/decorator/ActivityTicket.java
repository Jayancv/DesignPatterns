package structural.decorator;

public class ActivityTicket implements ITicket{
    @Override
    public String getDescription() {
        return "Adventure Park Ticket";
    }

    @Override
    public double getPrice() {
        return 100;
    }

    @Override
    public double getCost() {
        return 90;
    }
}
