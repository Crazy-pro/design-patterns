package alex.klimchuk.state;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class ConcreteState2 implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("State 2: Button has disabled");
        context.setState(new ConcreteState1());
    }
}
