package behavioral.visitor;

public class CalculateTotal implements IBookingItemVisitor
{
    private double total;


    public double getTotal()
    {
        return total;
    }

    @Override public void visit( IBookingItem item )
    {
        total = total + item.getPrice();
    }
}
