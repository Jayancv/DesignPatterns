package behavioral.memento;

import java.util.Objects;

public class Item
{
    private String type;
    private String name;
    private double price;

    public Item( String type, String name, double price )
    {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice( double price )
    {
        this.price = price;
    }

    @Override public String toString()
    {
        return "Item{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
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
        Item item = (Item) o;
        return Double.compare( item.price, price ) == 0 && type.equals( item.type ) && name.equals( item.name );
    }

    @Override public int hashCode()
    {
        return Objects.hash( type, name, price );
    }
}
