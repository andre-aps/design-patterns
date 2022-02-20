package store.discount;

import store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {
    public NoDiscount(Discount next) {
        super(null);
    }

    @Override
    boolean isApplicable(Budget budget) {
        return true;
    }

    @Override
    BigDecimal calculate(Budget budget) {
        return BigDecimal.ZERO;
    }
}
