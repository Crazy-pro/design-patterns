package alex.klimchuk.visitor;

import java.math.BigDecimal;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public record Fruit(String name, BigDecimal pricePerKg, double weight) implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
