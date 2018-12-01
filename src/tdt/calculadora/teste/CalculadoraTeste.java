package tdt.calculadora.teste;

import static org.junit.Assert.*;
import org.junit.Test;

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
	public void deveriaSubtrairDoisValores() throws Exception{
		int valorA = 5;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int subtrai = calculadora.subtrai(valorA, valorB);
		
		assertEquals(3, subtrai);
	}
}
