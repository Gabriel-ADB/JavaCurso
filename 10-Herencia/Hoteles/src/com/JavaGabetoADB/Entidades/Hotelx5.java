package com.JavaGabetoADB.Entidades;

public  final class Hotelx5 extends Hotelx4{
    private int cantSalonConfe;
    private int cantSuite;
    private int cantLimo;
    
   
    public Hotelx5(String nombre, String direccion, String localidad, String gerente, int cantHabitacionMatrimonial,
            int cantHabitacionIndividual, int numCamas, int cantPisos, double precioHabitacion, String nombRestaurant,
            int capacidadResto, String tipoGym, int cantSalonConfe, int cantSuite, int cantLimo) {
        super(nombre, direccion, localidad, gerente, cantHabitacionMatrimonial, cantHabitacionIndividual, numCamas,
                cantPisos, precioHabitacion, nombRestaurant, capacidadResto, tipoGym);
        this.cantSalonConfe = cantSalonConfe;
        this.cantSuite = cantSuite;
        this.cantLimo = cantLimo;
    }

    public int getCantSalonConfe() {
        return cantSalonConfe;
    }

    public void setCantSalonConfe(int cantSalonConfe) {
        this.cantSalonConfe = cantSalonConfe;
    }

    public int getCantSuite() {
        return cantSuite;
    }

    public void setCantSuite(int cantSuite) {
        this.cantSuite = cantSuite;
    }

    public int getCantLimo() {
        return cantLimo;
    }

    public void setCantLimo(int cantLimo) {
        this.cantLimo = cantLimo;
    }

    @Override
    public double calcularPrecioHabitacion() {
       
        return super.calcularPrecioHabitacion()+calculoGym()+calculoResto()+cantLimo;
    }

    @Override
    public double calculoGym() {
       
        return super.calculoGym();
    }

    @Override
    public double calculoResto() {
        
        return super.calculoResto();
    }

    @Override
    public String toString() {
      
        return super.toString()
        +". Salones de conferencia: "+cantSalonConfe
        +". Suites: "+cantSuite
        +". limosinas: "+cantLimo;
        
    }

   
   
}
