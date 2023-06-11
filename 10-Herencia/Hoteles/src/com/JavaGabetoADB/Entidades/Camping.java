package com.JavaGabetoADB.Entidades;

public final class Camping extends ExtraHotelero {
    private int capacidadCarpa;
    private int cantBaños;
    private boolean restoDentro;
    

    
    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado, double cantMts2,
            double precioHab, int capacidadCarpa, int cantBaños, boolean restoDentro) {
        super(nombre, direccion, localidad, gerente, privado, cantMts2, precioHab);
        this.capacidadCarpa = capacidadCarpa;
        this.cantBaños = cantBaños;
        this.restoDentro = restoDentro;
    }
    public int getCapacidadCarpa() {
        return capacidadCarpa;
    }
    public void setCapacidadCarpa(int capacidadCarpa) {
        this.capacidadCarpa = capacidadCarpa;
    }
    public int getCantBaños() {
        return cantBaños;
    }
    public void setCantBaños(int cantBaños) {
        this.cantBaños = cantBaños;
    }
    public boolean isRestoDentro() {
        return restoDentro;
    }
    public void setRestoDentro(boolean restoDentro) {
        this.restoDentro = restoDentro;
    }
    @Override
    public String toString() {
       
        return super.toString()
        +". Cantidad de capacidad de carpas: "+capacidadCarpa
        +". Cantidad de baños: "+cantBaños
        +". Resto en interior: "+restoDentro;
    }
    public boolean isTieneRestaurante() {
        return false;
    }

    

}
