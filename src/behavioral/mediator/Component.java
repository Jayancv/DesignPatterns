package behavioral.mediator;

public abstract class Component
{
    private IMediatorDialog mediatorDialog;

    public Component( IMediatorDialog mediatorDialog )
    {
        this.mediatorDialog = mediatorDialog;
    }

    public void notifyChange( String event )
    {
        mediatorDialog.notify( this, event );
    }

}
