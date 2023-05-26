package com.javagabeto.entidades;

public  class Velero extends Barco {
    private int cantMastil;

    public Velero(String matricula, double eslora, int anioFabricacion, int cantMastil) {
        super(matricula, eslora, anioFabricacion);
        this.cantMastil = cantMastil;
    }

    public int getCantMastil() {
        return cantMastil;
    }

    public void setCantMastil(int cantMastil) {
        this.cantMastil = cantMastil;
    }

    @Override
    public double calcularModulo() {
       
        return calcularModulo()+cantMastil;
    }

   
    

}
