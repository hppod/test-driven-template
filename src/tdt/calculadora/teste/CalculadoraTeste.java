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

}
