package loja.desconto;

import loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
public abstract class Desconto {
    Desconto proximo;

    public abstract BigDecimal calcular(Orcamento orcamento);
}
