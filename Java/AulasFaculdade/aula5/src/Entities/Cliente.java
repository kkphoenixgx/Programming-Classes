package Entities;

public class Cliente {
    public String nome;
    private String cpf;
    public String email;

    //-------------- Constructor --------------

    public Cliente(String nome, String cpf, String email){
        this.nome = nome;
        setCpf(cpf);
        this.email = email;
    }

    //-------------- methods --------------
    
    public boolean valideCpf(String cpf){
        if(cpf.length() == 11) return true;
        else return false;
    }

    //-------------- getters and setters --------------
    public void setCpf(String cpf){
        if(this.valideCpf(cpf)){
            this.cpf = cpf;
        }
        else{
            System.err.println("CPF inválido");
            System.exit(0);
        }
    }
    public String getCpf() {
        return cpf;
    }

}
