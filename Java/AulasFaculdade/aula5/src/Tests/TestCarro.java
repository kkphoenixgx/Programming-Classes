package Tests;

import java.util.ArrayList;
import java.util.List;

import Entities.Carro;
import Entities.Motor;

public class TestCarro {
    public void initTestes(){
        
        // Carro carroUm = new Carro("Vermelho", "Ferrari", 300, new Motor(1000, "Gazolina"));
        // Carro carroDois = new Carro("Branco", "Macklarin", 320, new Motor(2000, "Diezel"));


        List<Carro> collectionListCarro = new ArrayList<Carro>();
        // collectionListCarro.add(carroUm);
        // collectionListCarro.add(carroDois);

    
        this.testeMarcha(collectionListCarro);
        this.testeAcelerar(collectionListCarro, 10);

    }

    public void testeMarcha(List<Carro> collectionCarros){

        try {
            for (Carro carro : collectionCarros) {
                System.out.println( "TESTE: " + carro.mostrarCarro() + " marcha: " + carro.getMarcha());
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void testeAcelerar(List<Carro> collectionCarros, int valor){
        try {
            for (Carro carro : collectionCarros) {
                double velocidade = carro.getVelocidadeAtual();
                carro.acelerar(valor);
                System.out.println("TESTE: " + carro.mostrarCarro() + ". Velocidade anterior " + velocidade+ "km/h" + ", velocidade atual: " + carro.getVelocidadeAtual() + "km/h");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
