package br.com.alura.loja.orcamento.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcula(Orcamento orcamento, TipoImposto tipoImposto) {
		switch (tipoImposto) {
		case ICMS:
			return orcamento.getValor().multiply(new BigDecimal("0.1").setScale(2));
		case ISS:
			return orcamento.getValor().multiply(new BigDecimal("0.06"));
		default:
			return BigDecimal.ZERO;
		}
	}
	
}
