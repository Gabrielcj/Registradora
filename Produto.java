package job;

public class Produto {

	private String descricao;
	private float valor;
	private Fornecedor fornecedor;

	public Produto(String descricao, float valor, Fornecedor fornecedor) {
		this.descricao = descricao;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}

	public String getDescricao() {
		return descricao;
	}


	public float getValor() {
		return valor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public boolean addFornecedor(Fornecedor fornecedor) {
		boolean sucesso = false;
		
		if (this.fornecedor == null) {
			this.fornecedor = fornecedor;
			sucesso = true;
		}
		return sucesso;
	}
	
	public void removeFornecedor(Fornecedor fornecedor) {
		
		if(this.fornecedor!= null) {
			this. fornecedor = null;

		}
	}


	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", valor=" + valor + ", fornecedor=" + fornecedor + "]";
	}
	
	
}
