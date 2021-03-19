package br.com.franca.loja.imposto;

import java.math.BigDecimal;

import br.com.franca.loja.orcamento.Orcamento;

public interface Imposto {
	BigDecimal calcular(Orcamento orcamento);
}
