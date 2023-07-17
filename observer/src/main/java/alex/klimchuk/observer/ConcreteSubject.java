package alex.klimchuk.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class ConcreteSubject implements Subject {
    private final List<Observer> observers;
    private int state;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        System.out.println("Attached new observer: " + observer.getObserverName());
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        System.out.println("Detached observer: " + observer.getObserverName());
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public int getState() {
        return state;
    }
}
