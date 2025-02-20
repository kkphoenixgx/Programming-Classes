package Tests;

import java.util.ArrayList;
import java.util.List;

import Entities.Cliente;
import Entities.Conta;

public class TestConta {

    public void initTest(){

        Conta contaUm = new Conta(0, new Cliente("Kauã Alves Santos", "12345678912", "algumExemplo@email.com"));
        contaUm.setSaldo(2000);
        Conta contaDois = new Conta(1, new Cliente("Matheus Raposo", "12345678912","algumExemplo@email.com"));
        contaDois.setSaldo(5000000);

        List<Conta> collectionListConta = new ArrayList<Conta>();
        collectionListConta.add(contaUm);
        collectionListConta.add(contaDois);

        this.testeDeposito(collectionListConta, 10);
        this.testeSaque(collectionListConta, 10);
        this.testeTransferencia(contaUm, contaDois, 10);
        this.testeTransferencia(contaDois, contaUm, 10);

        System.out.println("---------------###----------------");
        this.printContas(collectionListConta);
        System.out.println("---------------###----------------");
    }

    // -------------- Side Methods --------------

    public void printContas(List<Conta> collectionListConta ){

        System.out.println("Contas:");
        for (Conta conta : collectionListConta) {
            System.out.println(conta.mostraDados());
        }

    }
    public void testeDeposito(List<Conta> collectionListConta, int valor ){
        try {
            for (Conta conta : collectionListConta) {
                conta.deposita(valor);
                System.out.println("TESTE: deposito de " + valor + ", valor na conta: " + conta.getSaldo());
            }
        } catch (Exception e) {
           System.out.println(e);
        }
    }
    public void testeSaque(List<Conta> collectionListConta, int valor){
        try {
            for (Conta conta : collectionListConta) {
                conta.saca(valor);
                System.out.println("TESTE: saque de " + valor + ", valor na conta: " + conta.getSaldo());
            }
        } catch (Exception e) {
           System.out.println(e);
        }
    }
    public void testeTransferencia(Conta remetente,Conta destinatario, int valor){
        try {
            remetente.transfere(valor, destinatario);

            System.out.println("TESTE: transferencia de " + valor + ". Do " + remetente.titular + "para " + destinatario.titular);
            System.out.println("TESTE: Valor remetente " + remetente.getSaldo() + ", valor destinatario:" + destinatario.getSaldo());
        } catch (Exception e) {
           System.out.println(e);
        }
    }

}
