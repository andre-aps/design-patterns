package store.discount;

import store.budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountGreaterThanFiveItems extends Discount {
    public BudgetDiscountGreaterThanFiveItems(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal getDiscount(Budget budget) {
        if (budget.getItemsQuantity() > 5)
            return budget.getValue().multiply(new BigDecimal("0.1"));

        return next.getDiscount(budget);
    }
}
