package loja.pedido.acao;

import loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
    public void executar(Pedido pedido) {
        System.out.println("Enviando e-mail com dados do pedido");
    }
}
