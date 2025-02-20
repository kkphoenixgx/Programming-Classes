package Entities;

public class Aluno extends Pessoa {

    private String matricula;

    Aluno(String matricula, String nome, String cpf, String telefone){
        super(nome, cpf, telefone);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

}
