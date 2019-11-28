package job;

public class Telefone {

	private String numero;

	public Telefone(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Telefone [numero=" + numero + "]";
	}
	
	
	
}
