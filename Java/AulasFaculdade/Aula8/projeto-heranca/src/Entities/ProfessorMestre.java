package Entities;

public class ProfessorMestre extends Professor {

    public String temaDaDissertacao;

    ProfessorMestre(String nome, String cpf, String telefone, String temaDaDissertacao) {
        super(nome, cpf, telefone);
        this.temaDaDissertacao = temaDaDissertacao;
    }



}
