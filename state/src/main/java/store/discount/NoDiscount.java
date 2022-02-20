package store.discount;

import store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {
    public NoDiscount(Discount next) {
        super(null);
    }

    @Override
    public BigDecimal getDiscount(Budget budget) {
        return BigDecimal.ZERO;
    }
}
