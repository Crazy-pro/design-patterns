package alex.klimchuk.observer;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver("Observer 1", subject);
        Observer observer2 = new ConcreteObserver("Observer 2", subject);

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState(10);

        subject.detach(observer1);

        subject.setState(20);
    }
}
