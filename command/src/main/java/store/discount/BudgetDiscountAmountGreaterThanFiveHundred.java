package store.discount;

import store.budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountAmountGreaterThanFiveHundred extends Discount {
    public BudgetDiscountAmountGreaterThanFiveHundred(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal getDiscount(Budget budget) {
        if (budget.getValue().compareTo(new BigDecimal("500")) > 0)
            return budget.getValue().multiply(new BigDecimal("0.05"));

        return next.getDiscount(budget);
    }
}
