package Controller;

import Entities.Conta;

public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double taxaPadrao;


    // ------------ Constructor ------------

    public AtualizadorDeContas(double taxaPadrao){
        this.setTaxaPadrao(taxaPadrao);
    }

    // ------------ Methods ------------

    public void atualizar(Conta conta){
        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.atualiza(getTaxaPadrao());

        System.out.println("Novo saldo: " + conta.getSaldo());

        this.saldoTotal += conta.getSaldo();
        
    }
    public void atualizar(Conta conta, int taxaNova){
        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.atualiza(taxaNova);

        System.out.println("Novo saldo: " + conta.getSaldo());
        
        this.saldoTotal += conta.getSaldo();
    }

    // ------------ getters and setters ------------

    public double getSaldoTotal() {
        return this.saldoTotal;
    }

    public double getTaxaPadrao() {
        return this.taxaPadrao;
    }

    public void setTaxaPadrao(double taxaPadrao) {
        this.taxaPadrao = taxaPadrao;
    }


}
