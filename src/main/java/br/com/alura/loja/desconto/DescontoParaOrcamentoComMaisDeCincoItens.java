package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}
	
	@Override
	public Boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

	@Override
	public BigDecimal efetuaCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1")).setScale(2);
	}
	
}
