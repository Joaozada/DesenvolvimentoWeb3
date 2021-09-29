package lojavarejo;

public class Vendedores {
	
	private String idVendedor;
	private String nomeVendedor;
	private String comissao;
	
	public Vendedores (String idVendedor, String nomeVendedor, String comissao) {
		this.idVendedor = idVendedor;
		this.nomeVendedor = nomeVendedor;
		this.comissao = comissao;
	}
		
	
	public String getIdVendedor() {
		return idVendedor;
	}
	public String getNomeVendedor() {
		return nomeVendedor;
	}
	
	public String getComissao() {
		return comissao;
	}
	
	public void setComissao(String comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public String toString() {
		return String.format("Id do Vendedor: %s\nNome do Vendedor: %s", this.idVendedor, this.nomeVendedor);
	}
}
	