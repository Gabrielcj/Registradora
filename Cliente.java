package job;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String cpf;
	private String nome;
	private List<Telefone> listaTelefone = new ArrayList<Telefone>();

	public Cliente(String cpf, String nome, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		Telefone tel = new Telefone(telefone);
		listaTelefone.add(tel);
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}


	public List<Telefone> getListaTelefone() {
		return listaTelefone;
	}


	public boolean addTelefone(String numero) {
		boolean sucesso = false;
		
		Telefone t = new Telefone(numero);
		
		if(!listaTelefone.contains(t) && listaTelefone.size() < 6) {
			listaTelefone.add(t);
			sucesso = true;
		}
		return sucesso;
	}
	
	public boolean removeTelefone(String numero) {
		boolean sucesso = false;
		
		Telefone t = new Telefone(numero);
		
		if(listaTelefone.size() > 1 && listaTelefone.contains(t)) {
			listaTelefone.remove(t);
			sucesso = true;
		}
		return sucesso;
	}


	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", listaTelefone=" + listaTelefone + "]";
	}
	
	
}
