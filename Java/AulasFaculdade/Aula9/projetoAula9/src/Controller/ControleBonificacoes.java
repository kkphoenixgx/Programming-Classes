package Controller;

import Entities.Funcionario;

public class ControleBonificacoes {
    
    private double totalDeBonificacoes = 0;

    public void registra(Funcionario f){
        this.totalDeBonificacoes += f.bonificacaoNatalina();
    }

    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }


}
