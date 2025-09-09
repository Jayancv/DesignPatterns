package behavioral.mediator;

public class TextBox extends Component
{
    private String text;

    public TextBox( IMediatorDialog mediatorDialog )
    {
        super( mediatorDialog );
    }
    public void setText(String text){
        this.text = text;
        notifyChange( "Changed TEXT" );
    }

    public String getText(){
        return text;
    }
}
