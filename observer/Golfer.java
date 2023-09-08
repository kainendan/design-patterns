package observer;

import java.util.ArrayList;

/**
 * Golfer is the subject of the observer pattern
 */
public class Golfer implements Subject{
    
    private ArrayList<Observer> observers;
    private String name;

    /**
     * subject constructor
     * @param name the name of the golfer
     */
    public Golfer(String name){
        observers = new ArrayList<Observer>();
        this.name = name;
    }

    /**
     * registers an observer
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * removes an observer
     */
    public void removerObserver(Observer observer){
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(i);
        }
    }

    /**
     * notifies all observers
     */
    public void notifyObservers(int strokes, int par){
        for(Observer observer : observers){
            observer.update(strokes, par);
        }
    }

    /**
     * enters the score for the hole
     * @param strokes the number of strokes for the hole
     * @param par the par for the hole
     */
    public void enterScore(int strokes, int par){
        notifyObservers(strokes, par);
    }

    /**
     * @return the name of the golfer
     */
    public String getName(){
        return name;
    }
}
