package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {
    boolean deveAplicar(Orcamento orcamento) {
        return true;
    }

    BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
