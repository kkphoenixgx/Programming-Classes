package Entities;

public class Conta {
	private int numero;
	private Cliente titular = new Cliente();//IMUTÁVEL
	private double saldo = 500;

	// ------ Construtors ------- 

	public Conta(){}
	public Conta(int numero){
		this.numero = numero;
	}


	// ------ Metodos ------- 

	public boolean saca(double valor) {
		if (this.saldo < valor || valor<=0)
			return false; // Early Return
		else {
			this.saldo -= valor;
			return true;
		}
	}

	public boolean deposita(double valor){
		if(valor<=0)
			return false;
		this.saldo+=valor;
		return true;
	}
	
	public boolean transferePara(Conta contaDestino, double valor) {
		if(this.saca(valor)) {
			return contaDestino.deposita(valor);
		}
		return false;
	}

	public void mostrarDados() {
		System.out.println("Titular "+this.getTitular().obtemDados());
		System.out.println("Numero: "+this.getNumero());
		System.out.println("Saldo: R$"+this.getSaldo());
	}

	public void atualiza(double taxa ){
		this.saldo = taxa;
	}

	// ------ getters and Setters ------- 
	
	public Cliente getTitular() {
		return this.titular;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if(numero<=0) return;
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	

	
}
