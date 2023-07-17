package alex.klimchuk.memento;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State 2");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State 3");
        caretaker.addMemento(originator.saveStateToMemento());

        System.out.println("Current State: " + originator.getState());

        originator.restoreStateFromMemento(caretaker.getMemento(1));
        System.out.println("Restored State: " + originator.getState());

        originator.restoreStateFromMemento(caretaker.getMemento(0));
        System.out.println("Restored State: " + originator.getState());

        originator.restoreStateFromMemento(caretaker.getMemento(2));
        System.out.println("Restored State: " + originator.getState());
    }
}
