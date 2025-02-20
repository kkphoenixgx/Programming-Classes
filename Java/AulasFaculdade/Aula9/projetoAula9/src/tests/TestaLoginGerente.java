package tests;

import Entities.Gerente;

public class TestaLoginGerente {
    public static void main(String[] args) {
                
        Gerente g1 = new Gerente("Isnerio", 4000, "123456789");

        if (g1.autentica("123456789")){
            System.out.println("Acesso Liberado");
        }
        else System.out.println("Acesso Negado");

        if(g1.autentica("123456789", "cefet")){
            System.out.println("Acesso Liberado!");
        }
        else System.out.println("Acesso Negado.");
    }
}
