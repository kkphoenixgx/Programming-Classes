
public class Cliente {
	private String nome;
	private String cpf;
	private String email;
	//Métodos get e set
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		if(nome.length()<5)
			return;//Early return
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		//Invocando método encapsulado
		if(this.cpfEhValido(cpf)==true)
			this.cpf = cpf;
	}
	//Método encapsulado
	private boolean cpfEhValido(String cpf) {
		if(cpf.length()!=11)
			return false;
		else
			return true;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String obtemDados() {
		String dados = "Nome: "+this.nome+" - Cpf: "
	+this.cpf+" - E-mail: "+this.email;
		return dados;
	}
	
}
