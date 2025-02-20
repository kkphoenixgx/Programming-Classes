
public class Conta {
	// atributos (características)
	private int numero;
	private Cliente titular = new Cliente();//IMUTÁVEL
	private double saldo = 500;
	//métodos de acesso
	public Cliente getTitular() {
		return this.titular;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if(numero<=0)
			return;//Early return
		//atributo numero = argumento numero 
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}
	// Comportamento (métodos)
	boolean saca(double valor) {
		if (this.saldo < valor || valor<=0)
			return false; // Early Return
		else {
			this.saldo -= valor;
			return true;
		}
	}

	boolean deposita(double valor){
		if(valor<=0)
			return false;
		this.saldo+=valor;
		return true;
	}
	
	boolean transferePara(Conta contaDestino, double valor) {
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
	
	
}
