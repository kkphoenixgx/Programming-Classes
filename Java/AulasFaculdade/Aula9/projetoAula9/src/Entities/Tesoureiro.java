package Entities;

public class Tesoureiro extends Funcionario{

    public Tesoureiro(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double bonificacaoNatalina() {
        return this.salario * 0.20;
    }
    
}
