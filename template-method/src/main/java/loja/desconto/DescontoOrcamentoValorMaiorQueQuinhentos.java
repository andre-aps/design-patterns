package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoValorMaiorQueQuinhentos extends Desconto {
    public DescontoOrcamentoValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }
}
