package store.discount;

import store.budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountGreaterThanFiveItems extends Discount {
    public BudgetDiscountGreaterThanFiveItems(Discount next) {
        super(next);
    }

    @Override
    boolean isApplicable(Budget budget) {
        return budget.getItemsQuantity() > 5;
    }

    @Override
    BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
