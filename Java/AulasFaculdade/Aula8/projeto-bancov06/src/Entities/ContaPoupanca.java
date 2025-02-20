package Entities;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(int numero){
        super(numero);
    }

    @Override
    public void atualiza(double taxa) {
        super.setSaldo(taxa*2);
    }



}
