package Entities;

import java.util.ArrayList;

public class Banco {
    
    private ArrayList<Conta> contas = new ArrayList<Conta>();

    //  ---------- Constructor ----------

    public Banco(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    //  ---------- Methods ----------

    public void adicionaConta(Conta conta){
        contas.add(conta);
    }

    public void getConta(Conta conta){
        for (Conta c : contas) {
            if(c == conta){
                conta.mostrarDados();
            }
        }
    }
    public void getConta(int position){
        this.contas.get(position).mostrarDados();
    }

    public int getTotalDeContas(){
        return this.contas.size();
    }

}
