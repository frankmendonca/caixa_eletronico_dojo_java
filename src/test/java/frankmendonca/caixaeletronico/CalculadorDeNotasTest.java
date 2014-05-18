package frankmendonca.caixaeletronico;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class CalculadorDeNotasTest {

	private CalculadorDeNotas calculador;

	@Before
	public void setUp() {
		calculador = new CalculadorDeNotas();
	}

	@Test
	public void testSacar100_UmaNotaDe100() {
		Map<Integer, Integer> possiveisNotas = new HashMap<>();

		possiveisNotas.put(100, 1);

		assertEquals(possiveisNotas, calculador.getNotas(100));
	}

	@Test
	public void testSacar75_UmaNotaDe50_UmaNotaDe20_UmaNotaDe5() {
		Map<Integer, Integer> possiveisNotas = new HashMap<>();

		possiveisNotas.put(50, 1);
		possiveisNotas.put(20, 1);
		possiveisNotas.put(5, 1);

		assertEquals(possiveisNotas, calculador.getNotas(75));
	}

	@Test
	public void testSacar_289_DuasNotasDe100_UmaNotaDe50_UmaNotaDe20_UmaNotaDe10_QuatroNotasDe1() {
		Map<Integer, Integer> possiveisNotas = new HashMap<>();

		possiveisNotas.put(100, 2);
		possiveisNotas.put(50, 1);
		possiveisNotas.put(20, 1);
		possiveisNotas.put(10, 1);
		possiveisNotas.put(5, 1);
		possiveisNotas.put(1, 4);

		assertEquals(possiveisNotas, calculador.getNotas(289));
	}

}
