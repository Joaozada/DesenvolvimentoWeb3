package lojavarejo;

public class Produtos {

	private String nomeProd;
	private String valorProd;
	private String tamanhoProd;
	
	public Produtos (String nomeProd, String valorProd, String tamanhoProd) {
		this.nomeProd = nomeProd;
		this.valorProd = valorProd;
		this.tamanhoProd = tamanhoProd;
	}
	
	public String getNomeProd() {
		return nomeProd;
	}
	public String getValorProd() {
		return valorProd;
	}
	public String getTamanhoProd() {
		return tamanhoProd;
	}
	
	public void setValorProd(String valorProd) {
		this.valorProd = valorProd;
	}
	
	@Override
	public String toString() {
		return String.format("Nome do Produto: %s\nValor do Produto: %s\nTamanho do Produto: %s", this.nomeProd, this.valorProd, this.tamanhoProd);
	}
	
}
