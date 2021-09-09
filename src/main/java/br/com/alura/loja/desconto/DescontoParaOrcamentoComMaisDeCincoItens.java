package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcula(Orcamento orcamento) {
		if(orcamento.getQuantidadeItens() > 5)
			return orcamento.getValor().multiply(new BigDecimal("0.1")).setScale(2);
		
		return proximo.calcula(orcamento);
	}
	
}
