package Entities;

public class Diretor extends Gerente{

    public Diretor(String nome, double salario, String senha) {
        super(nome, salario, senha);
    }

    @Override
    public double bonificacaoNatalina() {
        return super.salario * 0.50;
    }
    
}
