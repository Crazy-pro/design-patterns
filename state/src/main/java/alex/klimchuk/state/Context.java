package alex.klimchuk.state;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class Context {
    private State state;

    public Context() {
        this.state = new ConcreteState1();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        state.doAction(this);
    }
}
