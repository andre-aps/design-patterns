package loja.pedido;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class GeraPedido {
    private String nomeCliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;
}
