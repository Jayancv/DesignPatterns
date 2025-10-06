package behavioral.interpreter;

public class OrExpression implements IExpression
{
    private IExpression leftExpression;
    private IExpression rightExpression;

    public OrExpression( IExpression leftExpression, IExpression rightExpression )
    {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override public boolean interpret( ReservationContext reservationContext )
    {
        return leftExpression.interpret( reservationContext ) || rightExpression.interpret( reservationContext );
    }
}
