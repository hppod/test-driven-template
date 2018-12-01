package tdt.calculadora.teste;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTeste {

	@Test
	public void deveriaSomarDoisValores() throws Exception {
		int valorA = 1;
		int valorB = 2;
		int soma = 0;

		assertEquals(3, soma);
	}

}
