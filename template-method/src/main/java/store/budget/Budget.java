package store.budget;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Budget {
    private BigDecimal value;
    private int itemsQuantity;

    public static Budget of(BigDecimal value, int itemsQuantity) {
        return Budget.builder()
                .value(value)
                .itemsQuantity(itemsQuantity)
                .build();
    }
}
