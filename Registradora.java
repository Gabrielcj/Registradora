package job;

import java.util.ArrayList;
import java.util.List;

public class Registradora {

	private int identificador;
	private List<Venda> listaVenda = new ArrayList<Venda>();
	

	public Registradora(int identificador) {
		this.identificador = identificador;
	}

	
	public int getIdentificador() {
		return identificador;
	}


	public List<Venda> getListaVenda() {
		return listaVenda;
	}


	public boolean addVenda(Venda venda) {
		boolean sucesso = false;
		if(venda != null && !listaVenda.contains(venda)) {
			listaVenda.add(venda);
			sucesso = true;
		}
		return sucesso;
	}
	

	public boolean removeVenda (Venda venda) {
		boolean sucesso = false;
		
		if(listaVenda.size() > 0 && listaVenda.contains(venda)) {
			listaVenda.remove(venda);
			sucesso = true;
		}
		return sucesso;
	}
	
	
	public int qtdeDeVendas() {
		
	return listaVenda.size();
	}


	@Override
	public String toString() {
		return "Registradora [identificador=" + identificador + ", listaVenda=" + listaVenda + "]";
	}
	
	
}
