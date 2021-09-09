package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {

	public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);
	}
	
	@Override
	public Boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

	@Override
	public BigDecimal efetuaCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05")).setScale(2);
	}

}
