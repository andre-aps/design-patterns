package store.discount;

import store.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget) {
        Discount discountChain =
                new BudgetDiscountGreaterThanFiveItems(
                        new BudgetDiscountAmountGreaterThanFiveHundred(
                                new NoDiscount(null)));

        return discountChain.getDiscount(budget);
    }
}
