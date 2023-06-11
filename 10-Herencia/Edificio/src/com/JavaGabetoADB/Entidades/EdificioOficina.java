package com.JavaGabetoADB.Entidades;

public final class EdificioOficina extends Edificio {
    private int cantOficina;
    private int cantPersona;
    private int cantPiso;
    
    public EdificioOficina(double ancho, double alto, double largo, int cantOficina, int cantPersona, int cantPiso) {
        super(ancho, alto, largo);
        this.cantOficina = cantOficina;
        this.cantPersona = cantPersona;
        this.cantPiso = cantPiso;
    }
    public int getCantOficina() {
        return cantOficina;
    }
    public void setCantOficina(int cantOficina) {
        this.cantOficina = cantOficina;
    }
    public int getCantPersona() {
        return cantPersona;
    }
    public void setCantPersona(int cantPersona) {
        this.cantPersona = cantPersona;
    }
    public int getCantPiso() {
        return cantPiso;
    }
    public void setCantPiso(int cantPiso) {
        this.cantPiso = cantPiso;
    }

    public void cantidadPerson(){
        int persPiso = cantPersona*cantOficina;
        int persEdificio = persPiso*cantPiso;
        System.out.println("La cantidad de personas por piso es: "+persPiso);
        System.out.println("La cantidad total de personas en el edificio es: "+persEdificio);        
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

    

}
