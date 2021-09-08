package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class ICMS implements Imposto {
	
	public BigDecimal calcula(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1")).setScale(2);
	}

}
