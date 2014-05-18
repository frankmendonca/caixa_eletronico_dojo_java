package frankmendonca.caixaeletronico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaixaEletronicoTest_Saques {

	@Test
	public void testDepoisDoSaque_SemDinheito() {
		CaixaEletronico caixa = new CaixaEletronico(100);
		caixa.saque(100);
		assertEquals(0d, caixa.getSaldoAtual(), 0.001);
	}

	@Test
	public void testDepoisDoSaque_ComDinheito() {
		CaixaEletronico caixa = new CaixaEletronico(250);
		caixa.saque(100);
		assertEquals(150d, caixa.getSaldoAtual(), 0.001);
	}

	@Test(expected = SaldoInsulficienteException.class)
	public void testSaldoInsuficiente() {
		CaixaEletronico caixa = new CaixaEletronico(100);
		caixa.saque(200);
	}

}
