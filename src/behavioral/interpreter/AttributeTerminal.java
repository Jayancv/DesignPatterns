package behavioral.interpreter;

public class AttributeTerminal implements IExpression
{
    private String attribute;

    public AttributeTerminal( String attribute )
    {
        this.attribute = attribute;
    }

    public double getNumericValue( ReservationContext reservationContext )
    {
        return switch( attribute.toLowerCase() )
                {
                    case "price" -> reservationContext.getPrice();
                    case "seats" -> reservationContext.getSeats();
                    default -> 0.0;
                };
    }

    public String getAttribute()
    {
        return attribute;
    }

    @Override public boolean interpret( ReservationContext reservationContext )
    {
        return false;
    }
}
