package job;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private String dataHora;
	private List<ItemDeVenda> listaItens = new ArrayList<ItemDeVenda>();
	private Cliente cliente;

	public Venda(String dataHora, Cliente cliente, int qtde, Produto produto) {
		this.dataHora = dataHora;
		this.cliente = cliente;
		ItemDeVenda q = new ItemDeVenda(qtde, produto);
		listaItens.add(q);
	}


	public void trocaCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public String getDataHora() {
		return dataHora;
	}


	public List<ItemDeVenda> getListaItens() {
		return listaItens;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public boolean addItem(int qtde, Produto produto) {
		boolean sucesso = false;
		
		ItemDeVenda i = new ItemDeVenda(qtde, produto);
		
		if(!listaItens.contains(i)) {
			listaItens.add(i);
			sucesso = true;
	}
		return sucesso;
	}
	
	public boolean removeItem(int qtde, Produto produto) {
		boolean sucesso = false;
		
		ItemDeVenda i = new ItemDeVenda(qtde, produto);
		
		if(listaItens.contains(i) && listaItens.size() > 1) {
			listaItens.remove(i);
			sucesso = true;
		}
		return sucesso;
	}
	
	public float valorDaVenda() {
		
		int i;;
		float acumuladora = 0;
		float valorDaVenda = 0;
		
		for(i = 0; i < listaItens.size(); i++) {
			System.out.println(listaItens.get(i).getQtde());
			System.out.println(listaItens.get(i).getProduto());
			
			valorDaVenda = listaItens.get(i).getQtde() * listaItens.get(i).getProduto().getValor();
			acumuladora = acumuladora + valorDaVenda;
		
		}
		return valorDaVenda ;
	}


	@Override
	public String toString() {
		return "Venda [dataHora=" + dataHora + ", listaItens=" + listaItens + ", cliente=" + cliente + "]";
	}
	
	
}
