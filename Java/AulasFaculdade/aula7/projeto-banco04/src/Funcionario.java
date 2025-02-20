
public class Funcionario {
	private String nome, departamento;
	private double salario;
	private boolean ativo = true;
	private Data dataNascimento = new Data();
	//comportamento
	public void aumentarSalario(double percentual) {
		if(percentual<=0)
			return;
		this.salario += ((this.salario*percentual)/100);
	}
	public void demite() {
		this.ativo = false;
	}
	public void mostra() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Salario: "+this.getSalario());
		System.out.println("Departamento: "+this.getDepartamento());
		if(this.ativo)
			System.out.println("Status: ativo");
		else
			System.out.println("Status: inativo");
	}
	//get e set
	public Data getDataNascimento() {
		return this.dataNascimento;
	}
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isAtivo() {
		return this.ativo;
	}

}
