package alex.klimchuk.visitor;

import java.math.BigDecimal;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class ShoppingCartVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("Book: " + book.title() + ", Price: $" + book.price());
    }

    @Override
    public void visit(Fruit fruit) {
        BigDecimal cost = fruit.pricePerKg().multiply(BigDecimal.valueOf(fruit.weight()));
        System.out.println("Fruit: " + fruit.name() + ", Weight: " + fruit.weight() +
                "kg, Price: $" + fruit.pricePerKg() + " per kg, Total cost: $" + cost);
    }
}
