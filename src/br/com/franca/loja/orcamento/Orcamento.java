package br.com.franca.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {
	private BigDecimal value;
	
	

	public Orcamento(BigDecimal value) {
		super();
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	
}
