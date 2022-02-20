package store.discount;

import lombok.AllArgsConstructor;
import store.budget.Budget;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Discount {
    Discount next;

    public BigDecimal getDiscount(Budget budget) {
        if (isApplicable(budget))
            return this.calculate(budget);

        return next.getDiscount(budget);
    }

    abstract boolean isApplicable(Budget budget);

    abstract BigDecimal calculate(Budget budget);
}
