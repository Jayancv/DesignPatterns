package behavioral.interpreter;

public class NumberTerminal implements IExpression
{
    private Double num;

    public NumberTerminal( Double num )
    {
        this.num = num;
    }

    public Double getNum()
    {
        return num;
    }

    @Override public boolean interpret( ReservationContext reservationContext )
    {
        return true;
    }
}
