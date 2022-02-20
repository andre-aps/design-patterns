package store.budget.situation;

import store.budget.Budget;

import java.math.BigDecimal;

public class UnderAnalysis extends BudgetSituation {
    @Override
    public BigDecimal calculateExtraDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void approve(Budget budget) {
        budget.setSituation(new Approved());
    }

    @Override
    public void disapprove(Budget budget) {
        budget.setSituation(new Disapproved());
    }
}
