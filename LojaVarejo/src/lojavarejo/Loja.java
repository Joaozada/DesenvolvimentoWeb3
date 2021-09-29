package lojavarejo;

public class Loja {

	public static void main(String[] args) {
		
		Clientes clientes = new Clientes("Joao","11111", "Rua do Faustão");
		Produtos produtos = new Produtos("Skate", "R$850", "45cm");
		Transportadora transportadora = new Transportadora("Inferno", "Sedex", "Van");
		Vendedores vendedores = new Vendedores("25", "Eduardo", "R$ 225,00");
		
		Compra compra = new Compra(clientes,produtos,transportadora,vendedores);		
		
		System.out.println(compra.toString());
	}

}
