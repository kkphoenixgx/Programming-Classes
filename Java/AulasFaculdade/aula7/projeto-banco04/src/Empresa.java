import java.util.Arrays;

public class Empresa {
	private String nome, cnpj;
	private Funcionario[] empregados;
	private int posicaoLivre;
	//Construtor
	public Empresa(int qtdeFuncionarios) {
		this.empregados = new Funcionario[qtdeFuncionarios];
	}
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Funcionario[] getEmpregados() {
		return empregados;
	}
	public int getPosicaoLivre() {
		return posicaoLivre;
	}
	//Comportamento
	public void adiciona(Funcionario f) {
		if(this.posicaoLivre==this.empregados.length)
			this.aumentarArray();
		this.empregados[this.posicaoLivre]=f;
		this.posicaoLivre++;
	}
	private void aumentarArray() {
		this.empregados = Arrays.copyOf(this.empregados, this.empregados.length+1);
	}
	public void remove(Funcionario f) {
		for(int i=0;i<this.empregados.length;i++) {
			if(this.empregados[i]==f) {
				this.empregados[i]=null;
				this.reorganiza();
			}
		}
	}
	private void reorganiza() {
		Funcionario[] novoArray = new Funcionario[this.empregados.length-1];
		for(int i=0,j=0;i<this.empregados.length;i++) {
			if(this.empregados[i]!=null) {
				novoArray[j] = this.empregados[i];
				j++;
			}	
		}
		this.empregados = novoArray;
		this.posicaoLivre = novoArray.length;
	}
	public void mostraEmpregados() {
		for (Funcionario funcionario : this.empregados) {
			if(funcionario!=null)
				funcionario.mostra();
		}
	}
	public boolean estaNaEmpresa(Funcionario f) {
		for (Funcionario funcionario : empregados) {
			if(funcionario==f)
				return true;
		}
		return false;
	}
}
