package loja.pedido;

import loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Pedido {
    private String nomeCliente;
    private LocalDateTime data;
    private Orcamento orcamento;
}
