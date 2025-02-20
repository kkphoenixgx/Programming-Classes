package tests;

import Entities.Caixa;
import Entities.Funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        

        Funcionario f1 = new Funcionario("Lucia", 2000);
        Caixa c1 = new Caixa("Stutz", 2500, 1);

        f1.mostrarDados();
        System.out.println("Guiche :" + c1.getNumeroDoGuiche());
        System.out.println("Bonificação : R$" + c1.bonificacaoNatalina());

    }
}
