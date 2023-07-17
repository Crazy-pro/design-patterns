package alex.klimchuk.observer;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();

    void setState(int state);

    int getState();
}
