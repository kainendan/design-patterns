package observer;

/**
 * Subject is an interface for the subject of the observer pattern
 */
public interface Subject{

    public void registerObserver(Observer observer);

    public void removerObserver(Observer observer);

    public void notifyObservers(int strokes, int par);

}
