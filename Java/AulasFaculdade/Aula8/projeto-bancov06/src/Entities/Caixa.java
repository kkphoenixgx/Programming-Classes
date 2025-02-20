package Entities;

public class Caixa extends Funcionario {
    private int numeroDoGuiche;

    public Caixa(){
    }
    public Caixa(String nome, int salario, int numeroDoGuiche){
        super(nome, salario);
        this.numeroDoGuiche = numeroDoGuiche;
    }

    public int getNumeroDoGuiche() {
        return numeroDoGuiche;
    }
    public void setNumeroDoGuiche(int numeroDoGuiche) {
        this.numeroDoGuiche = numeroDoGuiche;
    }
}
