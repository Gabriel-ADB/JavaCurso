package com.JavaGabetoADB.Entidades;

public final class Polideportivo extends Edificio {
    private String nombre;
    private boolean techado;
    
    public Polideportivo(double ancho, double alto, double largo, String nombre, boolean techado) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isTechado() {
        return techado;
    }
    public void setTechado(boolean techado) {
        this.techado = techado;
    }
    @Override
    public void calcularSup() {
        double supTotal = 2 * (this.largo*this.ancho+this.largo*this.alto+this.ancho*this.alto);
        System.out.println("la superficie total es: "+supTotal);
        
    }
    @Override
    public void calcularVol() {
        double  volTotal = this.largo*this.ancho*this.alto;
        System.out.println("El volumen total es: "+volTotal);
        
    }
    @Override
    public String toString() {
        return "Polideportivo [nombre=" + nombre + ", techado=" + techado + "]";
    }

}
