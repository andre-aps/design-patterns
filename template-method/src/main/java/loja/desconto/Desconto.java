package loja.desconto;

import loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
public abstract class Desconto {
    Desconto proximo;

    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento))
            return efetuarCalculo(orcamento);

        return proximo.calcular(orcamento);
    }

    abstract boolean deveAplicar(Orcamento orcamento);

    abstract BigDecimal efetuarCalculo(Orcamento orcamento);
}
