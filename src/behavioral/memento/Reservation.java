package behavioral.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reservation
{
    private List<Item> itemList = new ArrayList<>();
    private double totalPrice;

    public Reservation()
    {
        totalPrice = 0;
    }

    public void addItem( Item item )
    {
        itemList.add( item );
        totalPrice = totalPrice + item.getPrice();
    }

    public void removeItem( Item item )
    {
        itemList.remove( item );
        totalPrice = totalPrice - item.getPrice();
    }

    // Save current state into a Memento
    public ReservationMemento save()
    {
        return new ReservationMemento( totalPrice, itemList );
    }

    // Restore from Memento
    public void restore( ReservationMemento memento )
    {
        this.totalPrice = memento.getTotalPrice();
        this.itemList = memento.getItemList();
    }

    @Override public boolean equals( Object o )
    {
        if( this == o )
        {
            return true;
        }
        if( o == null || getClass() != o.getClass() )
        {
            return false;
        }
        Reservation that = (Reservation) o;
        return Double.compare( that.totalPrice, totalPrice ) == 0 && itemList.equals( that.itemList );
    }

    @Override public int hashCode()
    {
        return Objects.hash( itemList, totalPrice );
    }

    @Override public String toString()
    {
        return "Reservation{" +
                "itemList=" + itemList +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
