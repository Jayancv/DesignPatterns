package behavioral.interpreter;

public class AndExpression implements IExpression
{
    private IExpression leftExpression;
    private IExpression rightExpression;

    public AndExpression( IExpression leftExpression, IExpression rightExpression )
    {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override public boolean interpret( ReservationContext reservationContext )
    {
        return leftExpression.interpret( reservationContext ) && rightExpression.interpret( reservationContext );
    }
}
