package com.JavaGabetoADB.Entidades;

public final class Residencia extends ExtraHotelero {
    private int cantidadCama;
    private boolean descuentoGremio;
    private boolean campoDeportivo;
    
    

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado,
            double cantMts2, double precioHab, int cantidadCama, boolean descuentoGremio, boolean campoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, cantMts2, precioHab);
        this.cantidadCama = cantidadCama;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantidadCama() {
        return cantidadCama;
    }

    public void setCantidadCama(int cantidadCama) {
        this.cantidadCama = cantidadCama;
    }

    public boolean isDescuentoGremio() {
        return descuentoGremio;
    }

    public void setDescuentoGremio(boolean descuentoGremio) {
        this.descuentoGremio = descuentoGremio;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()
        +". Cantidad de camas: "+cantidadCama
        +". Descuentos: "+descuentoGremio
        +". Campo deportivo: "+campoDeportivo;
    }

    public boolean isTieneDescuento() {
        return false;
    }

   
    
    
}
