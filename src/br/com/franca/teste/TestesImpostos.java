package br.com.franca.teste;
import java.math.BigDecimal;

import br.com.franca.loja.imposto.CalculadoraDeImpostos;
import br.com.franca.loja.imposto.ICMS;
import br.com.franca.loja.imposto.Imposto;
import br.com.franca.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal(100));
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
	}
}
