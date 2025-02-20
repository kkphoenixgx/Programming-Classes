package Entities;

public class Conta {
    public int numero;
    public Cliente titular;
    private double saldo = 500;

    // -------------- Constructor --------------

    public Conta(int numero, Cliente titular){
        this.numero = numero;
        this.titular = titular;
        this.setSaldo(0);
    }

    // -------------- Methods --------------

    public void saca(double valor){
        if (valor>this.saldo || valor <=0) return;

        this.saldo -= valor;
    }
    public void deposita(double valor){
        if(valor<=0)return;

        this.saldo += valor;
    }
    public void transfere(double valor, Conta contaDestino){
        if( valor<=0 || this == contaDestino) return;
        
        saca(valor);
        contaDestino.deposita(valor);
    }

    public String mostraDados(){
        return "Titular: " + this.titular + ", id: " + this.numero  + ", saldo: " + this.getSaldo();
    }

    // -------------- gets and sets --------------

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        deposita(saldo);
    }
    
}
