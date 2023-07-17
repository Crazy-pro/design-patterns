package alex.klimchuk.visitor;

import java.math.BigDecimal;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        Book book = new Book("Design Patterns", BigDecimal.valueOf(29.99));
        Fruit apple = new Fruit("Apple", BigDecimal.valueOf(1.99), 0.5);
        Fruit peach = new Fruit("Peach", BigDecimal.valueOf(5.99), 0.75);

        Visitor visitor = new ShoppingCartVisitor();
        book.accept(visitor);
        apple.accept(visitor);
        peach.accept(visitor);
    }
}
