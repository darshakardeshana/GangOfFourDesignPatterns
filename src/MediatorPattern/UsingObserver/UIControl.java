package MediatorPattern.UsingObserver;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    protected void notifyObserver(){
        for(var observer : observers){
            observer.update();
        }
    }
}
