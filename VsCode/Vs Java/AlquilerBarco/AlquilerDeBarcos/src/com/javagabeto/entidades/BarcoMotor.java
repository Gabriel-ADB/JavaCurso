package com.javagabeto.entidades;



public  class BarcoMotor extends Barco {
    private int potenciaCV;

    public BarcoMotor(String matricula, double eslora, int anioFabricacion, int potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {
       
        return calcularModulo()+potenciaCV;
    }

    

    
    

}
