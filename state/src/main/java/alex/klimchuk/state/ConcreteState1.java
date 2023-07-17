package alex.klimchuk.state;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class ConcreteState1 implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("State 1: Button has clicked");
        context.setState(new ConcreteState2());
    }
}
