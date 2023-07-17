package alex.klimchuk.strategy;

import java.math.BigDecimal;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        Item item1 = new Item("Book", BigDecimal.valueOf(9.99));
        Item item2 = new Item("Shirt", BigDecimal.valueOf(19.99));
        Item item3 = new Item("Hat", BigDecimal.valueOf(5.99));

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        PaymentStrategy creditCardPayment = new CreditCardStrategy("123456789", "12/25", "123");
        cart.pay(creditCardPayment);

        PaymentStrategy paypalPayment = new PayPalStrategy("john@example.com", "mypassword");
        cart.pay(paypalPayment);
    }
}
