package tests;

import Controller.GeradorDeRelatorio;
import Entities.FuncionarioDoCefet;
import Entities.ProfessorDoCefet;

public class TestaGeradorDeRelatorio {
    
    public static void main(String[] args) {
        
        FuncionarioDoCefet p1 = new ProfessorDoCefet("Rafael", 3000);

        FuncionarioDoCefet f1 = new FuncionarioDoCefet("João", 2000);
        
        FuncionarioDoCefet f2 = new FuncionarioDoCefet("Maria", 2500);
        

        FuncionarioDoCefet[] funcionarios = new FuncionarioDoCefet[3];
        funcionarios[0] = p1;
        funcionarios[1] = f1;
        funcionarios[2] = f2;

        GeradorDeRelatorio gerador = new GeradorDeRelatorio();
        gerador.setFuncionarios(funcionarios);
        gerador.imprime();

    }

}
