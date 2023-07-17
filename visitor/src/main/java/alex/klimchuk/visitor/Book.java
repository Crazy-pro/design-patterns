package alex.klimchuk.visitor;

import java.math.BigDecimal;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public record Book(String title, BigDecimal price) implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
