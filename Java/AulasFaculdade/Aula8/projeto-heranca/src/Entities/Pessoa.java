package Entities;

public class Pessoa {
    public String nome;
    private String cpf;
    protected String telefone;

    Pessoa(String nome, String cpf, String telefone){
    }

    public String getCpf() {
        return this.cpf;
    }

}
