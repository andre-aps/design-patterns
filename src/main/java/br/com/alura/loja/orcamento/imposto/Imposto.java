package br.com.alura.loja.orcamento.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcula(Orcamento orcamento);
	
}
