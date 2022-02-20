package br.com.alura.store.tax;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

@FunctionalInterface
public interface Tax {
    BigDecimal calculate(Budget budget);
}
