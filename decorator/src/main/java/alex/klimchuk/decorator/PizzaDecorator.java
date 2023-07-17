package alex.klimchuk.decorator;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public abstract class PizzaDecorator implements Pizza {
    protected final Pizza decoratedPizza;

    protected PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }
}
