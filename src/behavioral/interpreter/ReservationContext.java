package behavioral.interpreter;

public class ReservationContext
{
    private String type;
    private double price;
    private int seats;

    public ReservationContext( String type, double price, int seats) {
        this.type = type;
        this.price = price;
        this.seats = seats;
    }

    public String getType() { return type; }
    public double getPrice() { return price; }
    public int getSeats() { return seats; }

    @Override
    public String toString() {
        return type + " | Price: $" + price + " | Seats: " + seats;
    }
}
