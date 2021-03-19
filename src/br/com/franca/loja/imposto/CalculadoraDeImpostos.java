package br.com.franca.loja.imposto;

import java.math.BigDecimal;

import br.com.franca.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento oricamento, Imposto tipoImposto) {
		return tipoImposto.calcular(oricamento);

	}
}
