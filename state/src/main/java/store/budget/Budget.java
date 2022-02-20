package store.budget;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import store.budget.situation.BudgetSituation;
import store.budget.situation.UnderAnalysis;

import java.math.BigDecimal;

@Data
@Builder
public class Budget {
    private BigDecimal value;
    private int itemsQuantity;
    private BudgetSituation situation;

    public static Budget of(BigDecimal value, int itemsQuantity) {
        return Budget.builder()
                .value(value)
                .itemsQuantity(itemsQuantity)
                .situation(new UnderAnalysis())
                .build();
    }

    public void approve() {
        situation.approve(this);
    }

    public void disapprove() {
        situation.disapprove(this);
    }

    public void finish() {
        situation.finish(this);
    }

    public BigDecimal calculateExtraDiscount() {
        return situation.calculateExtraDiscount(this);
    }
}
