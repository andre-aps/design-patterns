package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoMaiorQueCincoItens extends Desconto {
    public DescontoOrcamentoMaiorQueCincoItens(Desconto proximo) {
        super(proximo);
    }

    boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
