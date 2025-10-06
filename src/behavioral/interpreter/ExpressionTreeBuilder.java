package behavioral.interpreter;

import java.util.Arrays;
import java.util.List;

public class ExpressionTreeBuilder
{
    private List<String> tokens;
    private int pos;

    public IExpression build( String input )
    {
        tokens = tokenize( input );
        return parse();
    }

    private List<String> tokenize( String input )
    {
        return Arrays.asList( input.trim().split( "\\s+" ) );
    }

    private IExpression parse()
    {
        IExpression left = parseTerm();

        while( pos < tokens.size() )
        {
            String token = tokens.get( pos ).toUpperCase();
            if( token.equals( "AND" ) )
            {
                pos++;
                IExpression right = parseTerm();
                left = new AndExpression( left, right );
            }
            else if( token.equals( "OR" ) )
            {
                pos++;
                IExpression right = parseTerm();
                left = new OrExpression( left, right );
            }
            else
            {
                break; // no more ANDs
            }
        }
        return left;
    }

    // <term> ::= <type> | <attribute> <operator> <number>
    private IExpression parseTerm()
    {
        if( pos >= tokens.size() )
        {
            return null;
        }

        String current = tokens.get( pos );

        // Look ahead for comparison like Price < 300
        if( ( pos + 2 ) < tokens.size() && isAttribute( current ) && isOperator( tokens.get( pos + 1 ) ) )
        {
            String attribute = tokens.get( pos++ );
            String operator = tokens.get( pos++ );
            String value = tokens.get( pos++ );

            AttributeTerminal attr = new AttributeTerminal( attribute );
            NumberTerminal num = new NumberTerminal( Double.parseDouble( value ) );

            return switch( operator )
                    {
                        case "<" -> new LessThanExpression( attr, num );
                        case ">" -> new HigherThanExpression( attr, num );
                        default -> throw new IllegalArgumentException( "Unsupported operator: " + operator );
                    };
        }

        // Otherwise it's a type like "Hotel"
        pos++;
        return new TypeTerminal( current );
    }

    private boolean isOperator( String token )
    {
        return token.equals( "<" ) || token.equals( ">" ) || token.equals( "=" );
    }

    private boolean isAttribute( String token )
    {
        return token.equalsIgnoreCase( "Price" ) || token.equalsIgnoreCase( "Seats" );
    }

}
