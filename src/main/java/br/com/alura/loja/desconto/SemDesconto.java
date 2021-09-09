package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	public Boolean deveAplicar(Orcamento orcamento) {
		return true;
	}
	
	@Override
	public BigDecimal efetuaCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
