package tests;

import Controller.AtualizadorDeContas;
import Entities.Conta;
import Entities.ContaCorrente;
import Entities.ContaPoupanca;

public class TestaAtualizadorDeContas {
    
    public static void main(String[] args) {
        Conta c = new Conta(1, 1000);
        Conta cc = new ContaCorrente(2, 1000);
        Conta cp = new ContaPoupanca(3, 1000);

        AtualizadorDeContas controllerAtualizadorDeContas = new AtualizadorDeContas(0.01);

        controllerAtualizadorDeContas.atualizar(c);
        controllerAtualizadorDeContas.atualizar(cc);
        controllerAtualizadorDeContas.atualizar(cp);

        System.out.println("Saldo total acumulado: " + controllerAtualizadorDeContas.getSaldoTotal() );
    }

}
