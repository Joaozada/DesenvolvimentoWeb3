package lojavarejo;

public class Compra {
	private Clientes clientes;
	private Produtos produtos;
	private Transportadora transportadora;
	private Vendedores vendedores;
	
	public Compra(Clientes clientes,Produtos produtos, Transportadora transportadora, 
				  Vendedores vendedores) {
		this.clientes = clientes;
		this.produtos = produtos;
		this.transportadora = transportadora;
		this.vendedores = vendedores;
		
		
	}
	
	public Clientes getClientes() {
		return this.clientes;
	}
	
	public Produtos getProdutos() {
		return this.produtos;
	}
	
	public Transportadora getTransportadora() {
		return this.transportadora;
	}
	
	public Vendedores getVendedores() {
		return this.vendedores;
	}
	
	public String toString() {
		 return String.format("Dados Cliente:\n%s\nDados do Produto\n%s\nDados da Transportadora\n%s\nDados do Vendedor\n%s\n", this.clientes.toString(),this.produtos.toString(),this.transportadora.toString(), this.vendedores.toString());
	}
}
