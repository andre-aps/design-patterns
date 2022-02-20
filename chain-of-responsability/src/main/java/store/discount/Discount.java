package store.discount;

import lombok.AllArgsConstructor;
import store.budget.Budget;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Discount {
    Discount next;

    abstract BigDecimal getDiscount(Budget budget);
}
