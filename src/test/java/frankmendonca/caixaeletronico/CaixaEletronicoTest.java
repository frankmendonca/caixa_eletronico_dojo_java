package frankmendonca.caixaeletronico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaixaEletronicoTest {

	@Test
	public void testComDinheiro() {
		CaixaEletronico caixa = new CaixaEletronico(100);
		assertEquals(100d, caixa.getSaldoAtual(), 0.001);
	}
}
