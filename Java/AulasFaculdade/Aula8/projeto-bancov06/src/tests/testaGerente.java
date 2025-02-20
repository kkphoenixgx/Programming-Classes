package tests;

import Entities.Caixa;
import Entities.Funcionario;
import Entities.Gerente;


public class testaGerente {


    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("lucila", 2000);
        Caixa c1 = new Caixa("Stutz", 2500, 12);
        Gerente g1 = new Gerente("Ismerio", 2500, "123456789");

        f1.mostrarDados();
        System.out.println("Bonificação: " + f1.bonificacaoNatalina());

        c1.mostrarDados();
        System.out.println("Guiche: " + c1.getNumeroDoGuiche());
        System.out.println("Bonificação: " + c1.bonificacaoNatalina());

        g1.mostrarDados();
        System.out.println("Bonificação: " + g1.bonificacaoNatalina());


    }



}
