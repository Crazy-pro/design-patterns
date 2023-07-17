package alex.klimchuk.strategy;

import java.math.BigDecimal;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public interface PaymentStrategy {
    void pay(BigDecimal amount);
}
