package Controller;

import Entities.FuncionarioDoCefet;

public class GeradorDeRelatorio {
    
    private FuncionarioDoCefet[] funcionarios;

    public void imprime(){
        for (FuncionarioDoCefet funcionarioDoCefet : funcionarios) {
            funcionarioDoCefet.mostrarDados();
            System.out.println(funcionarioDoCefet.getGastos());
            System.out.println("-----------------------------------------");
        }
    }


    public void setFuncionarios(FuncionarioDoCefet[] funcionarios) {
        this.funcionarios = funcionarios;
    }



}
