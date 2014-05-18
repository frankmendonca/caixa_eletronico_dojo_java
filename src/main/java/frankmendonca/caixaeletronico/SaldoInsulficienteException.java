package frankmendonca.caixaeletronico;

public class SaldoInsulficienteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SaldoInsulficienteException() {
		super("Saldo Insulficiente");
	}
}
