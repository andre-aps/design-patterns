package store.tax;

import store.budget.Budget;

import java.math.BigDecimal;

@FunctionalInterface
public interface Tax {
    BigDecimal calculate(Budget budget);
}
