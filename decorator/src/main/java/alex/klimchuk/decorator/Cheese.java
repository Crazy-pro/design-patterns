package alex.klimchuk.decorator;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class Cheese extends PizzaDecorator {
    public Cheese(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 1.5;
    }
}
