package Entities;

public class Funcionario {

    protected String nome; 
    protected double salario;

    // -------- Constructors --------
    
    public Funcionario(){
    }
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    // -------- Methods --------

    public double bonificacaoNatalina(){
        return this.salario * 0.10;
    }

    public void mostrarDados(){
        System.out.println("Nome :" + this.nome + ", Salario: " + this.salario );
    }


    // -------- Getters and Setters --------

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

}