package Entities;

public class Professor extends Pessoa {

    protected int horasDeAulaMes;
    public int valorHoraAula;
    protected int salario;

    Professor(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    private int calcularSalario(){
        return this.horasDeAulaMes * this.valorHoraAula;
    }
    
}
