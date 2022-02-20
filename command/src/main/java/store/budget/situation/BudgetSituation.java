package store.budget.situation;

import store.budget.Budget;
import store.budget.exception.SituationException;

import java.math.BigDecimal;

public abstract class BudgetSituation {
    public BigDecimal calculateExtraDiscount(Budget budget) {
        return BigDecimal.ZERO;
    }

    public void approve(Budget budget) {
        throw new SituationException("Budget cannot be approved!");
    }

    public void disapprove(Budget budget) {
        throw new SituationException("Budget cannot be disapproved!");
    }

    public void finish(Budget budget) {
        throw new SituationException("Budget cannot be finalized!");
    }
}
