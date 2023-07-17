package alex.klimchuk.strategy;

import java.math.BigDecimal;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class CreditCardStrategy implements PaymentStrategy {
    private final String cardNumber;
    private final String expirationDate;
    private final String cvv;

    public CreditCardStrategy(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paying $" + amount + " with credit card: " + cardNumber);
    }
}
