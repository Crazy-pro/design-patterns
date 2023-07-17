package alex.klimchuk.decorator;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class Margherita implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public double getCost() {
        return 6.99;
    }
}
