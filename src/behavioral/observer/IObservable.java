package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class IObservable
{
    List<IObserver> observers = new ArrayList<>();

    void addObservers(IObserver observer){
        observers.add( observer );
    }

    void removeObserver(IObserver observer){
        observers.remove( observer );
    }

    public abstract void notifyObservers();

}
