package loja.orcamento.situacao;

import loja.orcamento.Orcamento;
import loja.orcamento.exception.SituacaoException;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new SituacaoException("Orçamento não pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new SituacaoException("Orçamento não pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new SituacaoException("Orçamento não pode ser finalizado!");
    }
}
