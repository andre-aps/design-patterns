package loja.orcamento;

import loja.orcamento.situacao.EmAnalise;
import loja.orcamento.situacao.SituacaoOrcamento;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    public static Orcamento of(BigDecimal valor, int quantidadeItens) {
        return Orcamento.builder()
                .valor(valor)
                .quantidadeItens(quantidadeItens)
                .situacao(new EmAnalise())
                .build();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }
}
