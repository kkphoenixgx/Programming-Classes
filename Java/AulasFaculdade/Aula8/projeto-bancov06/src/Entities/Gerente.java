package Entities;

public class Gerente extends Funcionario {
    private String senha;

    public Gerente(String nome, double salario, String senha){
        super(nome, salario);
        this.senha = senha;
    }

    public boolean autentica(String senha){
        return (this.senha == senha);
    }
    public boolean autentica(String senha, String login){
        return (this.senha == senha && login == "cefet");
    }

    @Override
    public double bonificacaoNatalina() {
        return this.salario * 0.3;
    }


}
