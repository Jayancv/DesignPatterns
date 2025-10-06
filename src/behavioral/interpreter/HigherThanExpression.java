package behavioral.interpreter;


public class HigherThanExpression implements IExpression
{
    private AttributeTerminal left;
    private NumberTerminal right;

    public HigherThanExpression( AttributeTerminal left, NumberTerminal right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret( ReservationContext context) {
        return left.getNumericValue(context) > right.getNum();
    }
}
