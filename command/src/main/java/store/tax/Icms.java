package store.tax;

import store.budget.Budget;

import java.math.BigDecimal;

public class Icms implements Tax {
    @Override
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
