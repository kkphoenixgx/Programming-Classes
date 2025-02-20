package tests;

import Controller.ControleBonificacoes;
import Entities.Caixa;
import Entities.Diretor;
import Entities.Gerente;
import Entities.Tesoureiro;

public class TestaTotalDeBonificacoes {
    public static void main(String[] args) {
        
        ControleBonificacoes controle = new ControleBonificacoes();

        Gerente f1 = new Gerente("Fulano", 5000, "123456");
        Gerente f2 = new Gerente("Ciclano", 3000, "123456789");

        controle.registra(f1);
        controle.registra(f2);


        Caixa c1 = new Caixa("Bene", 3000, 1);
        controle.registra(c1);

        Tesoureiro t1 = new Tesoureiro("Matheus", 7000);
        controle.registra(t1);

        Diretor d1 = new Diretor("Lucas", 7000, "123456789");
        controle.registra(d1);

    }
}
