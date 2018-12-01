package teste.junit;

import org.junit.Test;
import org.junit.Assert;

public class ConfigJUnit {

	@Test
	public void testeConfiguracao() {
		Assert.assertEquals(2, (1 + 1), 0);
	}
}
