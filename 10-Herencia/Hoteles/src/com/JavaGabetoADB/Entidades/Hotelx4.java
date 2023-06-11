package com.JavaGabetoADB.Entidades;

import com.JavaGabetoADB.Interfaces.IHotel;

public class Hotelx4 extends Hotel implements IHotel {
    private String nombRestaurant;
    private int capacidadResto;
    private String tipoGym;

    

    public Hotelx4(String nombre, String direccion, String localidad, String gerente, int cantHabitacionMatrimonial,
            int cantHabitacionIndividual, int numCamas, int cantPisos, double precioHabitacion, String nombRestaurant,
            int capacidadResto, String tipoGym) {
        super(nombre, direccion, localidad, gerente, cantHabitacionMatrimonial, cantHabitacionIndividual, numCamas,
                cantPisos, precioHabitacion);
        this.nombRestaurant = nombRestaurant;
        this.capacidadResto = capacidadResto;
        this.tipoGym = tipoGym;
    }

    public String getNombRestaurant() {
        return nombRestaurant;
    }

    public void setNombRestaurant(String nombRestaurant) {
        this.nombRestaurant = nombRestaurant;
    }

    public int getCapacidadResto() {
        return capacidadResto;
    }

    public void setCapacidadResto(int capacidadResto) {
        this.capacidadResto = capacidadResto;
    }

    public String getTipoGym() {
        return tipoGym;
    }

    public void setTipoGym(String tipoGym) {
        this.tipoGym = tipoGym;
    }

    @Override
    public double calculoGym() {
        double valor;
        if (tipoGym.equalsIgnoreCase("A")) {
            valor = 50d;
        } else {
            valor = 30;
        }
        return valor;

    }

    @Override
    public double calculoResto() {
        double valor;
        if (capacidadResto < 30) {
            valor = 10d;

        } else if (capacidadResto > 50) {
            valor = 50d;
        } else {
            valor = 30d;
        }
        return valor;
    }

    @Override
    public double calcularPrecioHabitacion() {
      
        return super.calcularPrecioHabitacion()+calculoResto()+calculoGym();
    }

    @Override
    public String toString() {
       
        return super.toString()
        +". Restauraunt: "+nombRestaurant
        +". Capacidad: "+capacidadResto
        +". Gymnasio: "+tipoGym;
    }

    

}
