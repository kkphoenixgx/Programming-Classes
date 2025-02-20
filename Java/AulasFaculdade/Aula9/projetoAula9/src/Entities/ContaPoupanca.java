package Entities;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(int numero){
        super(numero);
    }
    public ContaPoupanca(int numero, double saldo){
        super(numero, saldo);
    }

    @Override
    public void atualiza(double taxa) {
        super.setSaldo(taxa*2);
    }



}
