package behavioral.mediator;

public class Button extends Component
{
    public Button( IMediatorDialog mediatorDialog )
    {
        super( mediatorDialog );
    }

    public void click(){
        notifyChange( "Clicked" );
    }
}

