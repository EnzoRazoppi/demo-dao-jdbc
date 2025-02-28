package db;

public class DbIntegrityException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DbIntegrityException(String msg) {
		super(msg);
	}

	// Quando se quer deletar algo q é uma foreign key de outra tabela
}
