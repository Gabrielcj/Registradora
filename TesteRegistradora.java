package trabalho3;

public class TesteRegistradora {

	public static void main(String[] args) {
		Registradora regCaixaRapido = new Registradora(123);
		Cliente c1 = new Cliente("1111", "João", "111-111");
		Cliente c2 = new Cliente("2222", "Maria", "777-777");
		c1.addTelefone("222-222");
		c1.addTelefone("333-333");
		c1.addTelefone("444-444");
		c1.addTelefone("555-555");
		c1.addTelefone("666-6666");
		System.out.println(c1);
		Fornecedor f1 = new Fornecedor("Real Distribuidora");
		Fornecedor f2 = new Fornecedor("Megafort Atacadista");
		Produto p1 = new Produto("Impressora", 850, f1);
		Produto p2 = new Produto("Mouse", 50, f2);
		Produto p3 = new Produto("Teclado", 120, f2);
		Venda v1 = new Venda("22/01/17 10:30", c2, 5, p1);
		v1.addItem(15, p1);
		v1.addItem(3, p2);
		v1.addItem(8, p3);
		v1.addItem(20, p3);
		System.out.println(v1);
		System.out.println("Total da Venda 1: R$ " + v1.valorDaVenda());
		regCaixaRapido.addVenda(v1);
		System.out.println(regCaixaRapido);
		Venda v2 = new Venda("22/01/17 10:45", c1, 2, p2);
		regCaixaRapido.addVenda(v2);
		System.out.println("Total da Venda 2: R$ " + v2.valorDaVenda());
		System.out.println(regCaixaRapido);
		System.out.println("Qtde de Vendas: " + regCaixaRapido.qtdeDeVendas());
		}

	
}
