package alex.klimchuk.strategy;

import java.math.BigDecimal;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class PayPalStrategy implements PaymentStrategy {
    private final String email;
    private final String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paying $" + amount + " with PayPal account: " + email);
    }
}
