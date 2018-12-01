package tdt.calculadora.teste;

import static org.junit.Assert.*;
import org.junit.Test;

import tdt.calculadora.master.Calculadora;

public class CalculadoraTeste {

	@Test
	public void deveriaSomarDoisValores() throws Exception {
		int valorA = 1;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.soma(valorA, valorB);

		assertEquals(3, soma);
	}

	@Test
	public void deveriaSubtrairDoisValores() throws Exception {
		int valorA = 5;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int subtrai = calculadora.subtrai(valorA, valorB);

		assertEquals(3, subtrai);
	}

	@Test
	public void deveriaMultiplicarDoisValores() throws Exception {
		int valorA = 5;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int multiplica = calculadora.multiplica(valorA, valorB);

		assertEquals(10, multiplica);

	}

	@Test
	public void deveriaDividirDoisValores() throws Exception {
		int valorA = 6;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int divide = calculadora.divide(valorA, valorB);

		assertEquals(3, divide);
	}

	@Test(expected = ArithmeticException.class)
	public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero() throws Exception {
		int valorA = 6;
		int valorB = 0;
		Calculadora calculadora = new Calculadora();
		calculadora.divide(valorA, valorB);
	}
}
