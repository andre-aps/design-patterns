package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public final BigDecimal calcula(Orcamento orcamento) {
		if(deveAplicar(orcamento))
			return efetuaCalculo(orcamento);
		
		return proximo.calcula(orcamento);
	}
	
	protected abstract Boolean deveAplicar(Orcamento orcamento);
	protected abstract BigDecimal efetuaCalculo(Orcamento orcamento);
	
}
