package Entities;

public class Motor {
    private double potencia;
    private String tipoDeCombustivel;
    private boolean ligado = false;
    
    // -------------- Constructors -------------- 

    public Motor(double potencia, String tipoDeCombustivel){
        this.potencia = potencia;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    // -------------- methods -------------- 

    public void ligar(){
        this.ligado = true;
        System.out.println("Motor Ligando...");
    }
    public void desligar(){
        this.ligado = false;
        System.out.println("Motor Desligando...");
    }
    public String mostrarMotor(){
        return "Potencia= " + this.potencia + ", tipo de combustível= " + this.potencia; 
    }

    // -------------- getters and setters -------------- 

    public boolean isLigado(){
        return this.ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }
    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }


}
