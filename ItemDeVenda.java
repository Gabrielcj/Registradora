package job;

public class ItemDeVenda {

	private int qtde;
	private Produto produto;
	
	public ItemDeVenda(int qtde, Produto produto) {
		this.qtde = qtde;
		this.produto = produto;
	}

	public int getQtde() {
		return qtde;
	}

	public Produto getProduto() {
		return produto;
	}

	@Override
	public String toString() {
		return "ItemDeVenda [qtde=" + qtde + ", produto=" + produto + "]";
	}
	
	
	
}
