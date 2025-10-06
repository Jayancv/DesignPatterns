package behavioral.interpreter;

import java.util.List;

public class RuleEvaluator
{
    public static void main( String[] args )
    {
        List<ReservationContext> reservations = List.of(
                new ReservationContext("Hotel", 250, 2),
                new ReservationContext("Hotel", 350, 1),
                new ReservationContext("Flight", 600, 1),
                new ReservationContext("Restaurant", 0, 4)
        );

        ExpressionTreeBuilder builder = new ExpressionTreeBuilder();

        String query = "Hotel AND Price < 300";
        IExpression expr = builder.build(query);

        System.out.println("=== Evaluating: " + query + " ===");
        for (ReservationContext r : reservations) {
            if (expr.interpret(r)) {
                System.out.println(r);
            }
        }

        ExpressionTreeBuilder builder2 = new ExpressionTreeBuilder();
        String query2 = "Flight AND Price > 500 OR Seats > 1";
        IExpression expr2 = builder2.build(query2);

        System.out.println("=== Evaluating: " + query2 + " ===");
        for (ReservationContext r : reservations) {
            if (expr2.interpret(r)) {
                System.out.println(r);
            }
        }
    }
}
