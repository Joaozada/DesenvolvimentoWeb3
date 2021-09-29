package lojavarejo;

public class Clientes {
	private String nomeCompleto;
	private String cpf;
	private String enderecoCli;
	
	public Clientes (String nomeCompleto, String cpf, String endereco) {
		
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.enderecoCli =  endereco;
		
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public String getCpf() {
		return cpf;
	}
		
	public String getEnderecoCli() {
		return enderecoCli;
	}
	
	public void setenderecoCliente(String enderecoCli) {
		this.enderecoCli = enderecoCli;
	}
	
	@Override
	public String toString() {
		return String.format("Nome do Cliente: %s\nCpf do Cliente: %s\nEndereço do Cliente: %s", this.nomeCompleto, this.cpf, this.enderecoCli);
	}
}

