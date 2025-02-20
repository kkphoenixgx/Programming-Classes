package Entities;

public class ProfessorDoCefet extends FuncionarioDoCefet {
    
    private double auxilioAlimentacao = 400.0;

    public ProfessorDoCefet(String nome, double salario){
        super(nome, salario);
    }


    @Override
    public void mostrarDados() {
        System.out.println("Nome :" + this.nome + ", Salario: (" + this.salario + "+ auxilio alimentação: " + this.getAuxilioAlimentacao() + ") " + this.getGastos() );
    }

    public double getAuxilioAlimentacao() {
        return auxilioAlimentacao;
    }

    @Override
    public double getGastos() {
        // TODO Auto-generated method stub
        return this.auxilioAlimentacao + super.getGastos();
    }

}
