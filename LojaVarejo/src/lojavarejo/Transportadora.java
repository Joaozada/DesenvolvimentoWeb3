package lojavarejo;

public class Transportadora {
	
	private String enderecoTrans;
	private String empresaTrans;
	private String veiculoTrans;
	
	public Transportadora(String enderecoTrans, String empresaTrans, String veiculoTrans) {
		this.enderecoTrans = enderecoTrans;
		this.empresaTrans = empresaTrans;
		this.veiculoTrans = veiculoTrans;
	}
	
	public String getEnderecoTrans() {
		return enderecoTrans;
	}
	
	public String getEmpresaTrans() {
		return empresaTrans;
	}
	
	public String getVeiculoTrans() {
		return veiculoTrans;
	}
	
	public void setEnderecoTrans(String enderecoTrans) {
		this.enderecoTrans = enderecoTrans;
	}
	
	public void setVeiculoTrans(String veiculoTrans) {
		this.veiculoTrans = veiculoTrans;
	}
	
	@Override
	public String toString() {
		return String.format("Empresa: %s\nVeiculo: %s", this.empresaTrans, this.veiculoTrans);
	}
}
