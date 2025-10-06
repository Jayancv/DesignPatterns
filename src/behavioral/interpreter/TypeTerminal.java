package behavioral.interpreter;

public class TypeTerminal implements IExpression
{
    private String expectedType;

    public TypeTerminal(String expectedType) {
        this.expectedType = expectedType;
    }

    @Override public boolean interpret( ReservationContext reservationContext )
    {
        return reservationContext.getType().equalsIgnoreCase(expectedType);
    }
}
