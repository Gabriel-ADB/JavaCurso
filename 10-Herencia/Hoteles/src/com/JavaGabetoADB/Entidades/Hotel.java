package com.JavaGabetoADB.Entidades;

public abstract class Hotel extends Alojamiento  {
    private int cantHabitacionMatrimonial;
    private int cantHabitacionIndividual;
    private int numCamas;
    private int cantPisos;
    private double precioHabitacion;
  


    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantHabitacionMatrimonial,
            int cantHabitacionIndividual, int numCamas, int cantPisos, double precioHabitacion) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitacionMatrimonial = cantHabitacionMatrimonial;
        this.cantHabitacionIndividual = cantHabitacionIndividual;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        int totalInquilinosXpiso = (cantHabitacionMatrimonial*2)+cantHabitacionIndividual;
        int totalInquilinosHotel= totalInquilinosXpiso+cantPisos;
        this.precioHabitacion = 50+totalInquilinosHotel;
    }


    public int getCantHabitacionMatrimonial() {
        return cantHabitacionMatrimonial;
    }

    public void setCantHabitacionMatrimonial(int cantHabitacionMatrimonial) {
        this.cantHabitacionMatrimonial = cantHabitacionMatrimonial;
    }

    public int getCantHabitacionIndividual() {
        return cantHabitacionIndividual;
    }

    public void setCantHabitacionIndividual(int cantHabitacionIndividual) {
        this.cantHabitacionIndividual = cantHabitacionIndividual;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    
    public double calcularPrecioHabitacion(){
        return precioHabitacion;
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()
        +".Cantidad de habitaciones matrimonial: "+cantHabitacionMatrimonial
        +". Cantidad de habitaciones individual: "+cantHabitacionIndividual
        +". Total camas: "+numCamas
        +". Pisos del hotel: "+cantPisos
        +". Precio habitacion: "+precioHabitacion;
    }


    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

   
    

   
    
}
