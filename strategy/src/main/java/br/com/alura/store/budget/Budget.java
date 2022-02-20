package br.com.alura.store.budget;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Budget {
    private BigDecimal value;

    public static Budget of(BigDecimal value) {
        return Budget.builder()
                .value(value)
                .build();
    }
}
