package tests;

import Entities.Conta;
import Entities.ContaCorrente;
import Entities.ContaPoupanca;

public class TestaContas {
    
    public static void main(String[] args) {
        Conta c = new Conta(2);
        c.deposita(1000);

        ContaCorrente cc = new ContaCorrente(2);
        cc.deposita(1000);

        ContaPoupanca cp = new ContaPoupanca(3);
        cp.deposita(1000);

        System.out.println("Saldo das contas antes de atualizar:");
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);
        
        
        System.out.println("Saldo das contas depois de atualizar:");
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

    }

}
