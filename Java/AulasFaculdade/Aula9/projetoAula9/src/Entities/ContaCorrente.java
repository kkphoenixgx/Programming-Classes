package Entities;

public class ContaCorrente extends Conta {
    

    public ContaCorrente(int numero){
        super(numero);
    }
    public ContaCorrente(int numero, double saldo){
        super(numero, saldo);
    }

    @Override
    public void atualiza(double taxa) {
        super.setSaldo( super.getSaldo() - taxa*2);
    }

    @Override
    public boolean deposita(double valor) {
        return super.deposita(valor + 0.10);
    }

}
