package com.javagabeto.entidades;

public class Yate extends Barco {
    private int cantCamarote;
    private int potenciaMotor;

    public Yate(String matricula, double eslora, int anioFabricacion, int cantCamarote, int potenciaMotor) {
        super(matricula, eslora, anioFabricacion);
        this.cantCamarote = cantCamarote;
        this.potenciaMotor = potenciaMotor;
    }

    public int getCantCamarote() {
        return cantCamarote;
    }

    public void setCantCamarote(int cantCamarote) {
        this.cantCamarote = cantCamarote;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    protected double calcularModulo() {
       
        return calcularModulo()+potenciaMotor+cantCamarote;
    }

}
