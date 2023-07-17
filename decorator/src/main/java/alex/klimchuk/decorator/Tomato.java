package alex.klimchuk.decorator;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class Tomato extends PizzaDecorator {
    public Tomato(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Tomato";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 0.75;
    }
}
