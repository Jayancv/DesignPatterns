package behavioral.visitor;

public class DocumentGenerator implements IBookingItemVisitor
{
    private String doc = "";

    @Override public void visit( IBookingItem item )
    {
        doc = doc + '\n' + item.getDescription();
    }

    public String getDoc()
    {
        return doc;
    }
}
