package store.discount;

import store.budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountAmountGreaterThanFiveHundred extends Discount {
    public BudgetDiscountAmountGreaterThanFiveHundred(Discount next) {
        super(next);
    }

    @Override
    boolean isApplicable(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }

    @Override
    BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }
}
