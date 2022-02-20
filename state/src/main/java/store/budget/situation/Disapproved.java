package store.budget.situation;

import store.budget.Budget;

public class Disapproved extends BudgetSituation {
    @Override
    public void finish(Budget budget) {
        budget.setSituation(new Finished());
    }
}
