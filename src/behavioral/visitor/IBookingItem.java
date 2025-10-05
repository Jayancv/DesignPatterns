package behavioral.visitor;

public interface IBookingItem
{
    double getPrice();
    String getDescription();
    void accept(IBookingItemVisitor visitor);
}
