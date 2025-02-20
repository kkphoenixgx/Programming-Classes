package Entities;

public class FuncionarioDoCefet extends Funcionario {
    
    private int matriculaSiap;

    public FuncionarioDoCefet(String nome, double salario){
        super(nome, salario);
    }


    public double getGastos(){
        return this.getSalario();
    }

    public int getMatriculaSiap() {
        return this.matriculaSiap;
    }
    public void setMatriculaSiap(int matriculaSiap) {
        this.matriculaSiap = matriculaSiap;
    }


}
