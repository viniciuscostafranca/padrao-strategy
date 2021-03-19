package br.com.franca.loja.imposto;

import java.math.BigDecimal;

import br.com.franca.loja.orcamento.Orcamento;

public class ICMS  implements Imposto{
	public BigDecimal  calcular(Orcamento orcamento) {
		return orcamento.getValue().multiply(new BigDecimal("0.1"));
	}
}
