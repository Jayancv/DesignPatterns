package structural.bridge;

public abstract class Document {

    protected Notification notification;

    public Document(Notification notification) {
        this.notification = notification;
    }

    public abstract void generateDocument() ;
}
