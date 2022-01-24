package loja.pedido;

import loja.orcamento.Orcamento;
import loja.pedido.acao.AcaoAposGerarPedido;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
public class ExecutaPedido {
    private List<AcaoAposGerarPedido> acoes;

    public void executar(GeraPedido pedido) {
        Orcamento orcamento = Orcamento.of(pedido.getValorOrcamento(), pedido.getQuantidadeItens());

        Pedido novoPedido = new Pedido(pedido.getNomeCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acao -> acao.executar(novoPedido));
    }
}
