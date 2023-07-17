package alex.klimchuk.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class ShoppingCart {
    private final List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public BigDecimal getTotal() {
        return items.stream()
                .map(Item::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void pay(PaymentStrategy paymentStrategy) {
        BigDecimal total = getTotal();
        paymentStrategy.pay(total);
    }
}
