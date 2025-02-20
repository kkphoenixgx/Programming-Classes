package Entities;

public class Carro {
    private String cor;
    private String modelo;
    private double velocidadeAtual;
    public double velocidadeMaxima = 140;
    private Motor motor;

    private int capacidadeMaximaDeCombustivel;
    private int capacidadeDeCombustivelAtual = 0;

    // -------------- Constructor --------------

    public Carro(String cor, String modelo, double velocidadeMaxima, Motor motor, int capacidadeMaximaDeCombustivel){
        this.cor = cor;
        this.modelo = modelo;
        setVelocidadeAtual(0);
        this.velocidadeMaxima = velocidadeMaxima;
        this.motor = motor;
        this.capacidadeMaximaDeCombustivel = capacidadeMaximaDeCombustivel;
    }

    //-------------- Métodos --------------

    public void ligar(){
        System.out.println("Ligando o carro...");
    }

    public void acelerar(double velocidade){
        this.velocidadeAtual += velocidade;
    }

    public int getMarcha(){
        if(this.velocidadeAtual <= 0) return -1;
        else if(this.velocidadeAtual <= 20) return -1;
        else if(this.velocidadeAtual <= 40) return -1;
        else if(this.velocidadeAtual <= 60) return -1;
        else if(this.velocidadeAtual <= 80) return -1;
        else return 5;
    }


    public String mostrarCarro(){
        return "Carro: " + this.modelo + ", motor: " + this.motor.mostrarMotor() + ", cor: " + this.cor + ", velocidade máxima: " + this.velocidadeMaxima;
    }

    //-------------- getters and setters --------------
    public double getVelocidadeAtual() {
        return this.velocidadeAtual;
    }
    public void setVelocidadeAtual(double value) {
        if(!(this.velocidadeAtual + value > velocidadeMaxima))  this.velocidadeAtual += velocidadeAtual;
    }
    public int getCapacidadeDeCombustivelAtual() {
        return capacidadeDeCombustivelAtual;
    }
    // public void setCapacidadeMaximaDeCombustivel(int value) {
    //     if(value < capacidadeMaximaDeCombustivel)
    // }


}
