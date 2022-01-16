package loja.pedido;

import loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class ExecutaPedido {
    public void executar(GeraPedido pedido) {
        Orcamento orcamento = Orcamento.of(pedido.getValorOrcamento(), pedido.getQuantidadeItens());

        Pedido novoPedido = new Pedido(pedido.getNomeCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar e-mail com dados do pedido");
    }
}
