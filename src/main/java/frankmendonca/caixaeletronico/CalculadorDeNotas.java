package frankmendonca.caixaeletronico;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class CalculadorDeNotas {

	private static final Integer[] NOTAS = { 100, 50, 20, 10, 5, 1 };

	public Map<Integer, Integer> getNotas(int valor) {
		final Map<Integer, Integer> notas = geraNotas(valor);

		check(notas, valor);

		return notas;
	}

	private Map<Integer, Integer> geraNotas(int valor) {
		final Map<Integer, Integer> notas = new HashMap<>();

		for (Integer nota : NOTAS) {
			while (valor > 0) {
				if (valor < nota) {
					break;
				}

				Integer qtde = notas.get(nota);

				if (qtde == null) {
					qtde = 0;
				}

				qtde++;

				notas.put(nota, qtde);

				valor -= nota;
			}
		}
		return notas;
	}

	private void check(final Map<Integer, Integer> notas, final int valor) {
		int soma = 0;

		for (Entry<Integer, Integer> nota : notas.entrySet()) {
			soma += nota.getKey() * nota.getValue();
		}

		if (soma != valor) {
			StringBuilder mensagem = new StringBuilder();
			mensagem.append("Notas invalidas para o valor");
			mensagem.append("\n- Notas: %s");
			mensagem.append("\n- Somando da: %d");
			mensagem.append("\n- Soma esperada: %d");

			throw new RuntimeException(String.format(mensagem.toString(),
					notas.toString(), soma, valor));
		}
	}
}
