package alex.klimchuk.observer;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public record ConcreteObserver(String observerName, Subject subject) implements Observer {

    @Override
    public String getObserverName() {
        return this.observerName;
    }

    @Override
    public void update() {
        System.out.println(observerName + " received an update. New state: " + subject.getState());
    }
}
