package behavioral.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReservationMemento
{
    private final List<Item> itemList;
    private final double totalPrice;

    public ReservationMemento( double totalPrice, List<Item> itemList )
    {
        List<Item> list = new ArrayList<>();
        for( Item i : itemList )
        {
            list.add( new Item( i.getType(), i.getName(), i.getPrice() ) );
        }
        this.totalPrice = totalPrice;
        this.itemList = list;
    }

    public List<Item> getItemList()
    {
        return itemList;
    }

    public double getTotalPrice()
    {
        return totalPrice;
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
        ReservationMemento that = (ReservationMemento) o;
        return Double.compare( that.totalPrice, totalPrice ) == 0 && itemList.equals( that.itemList );
    }

    @Override public int hashCode()
    {
        return Objects.hash( itemList, totalPrice );
    }
}
