package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos =
                new DescontoOrcamentoMaiorQueCincoItens(
                        new DescontoOrcamentoValorMaiorQueQuinhentos(
                                new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
