package job;

public class Fornecedor {

	private String nome;

	public Fornecedor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Fornecedor [nome=" + nome + "]";
	}	
	
	
}
