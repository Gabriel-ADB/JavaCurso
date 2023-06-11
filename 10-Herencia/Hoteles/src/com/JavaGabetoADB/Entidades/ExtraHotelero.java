package com.JavaGabetoADB.Entidades;

public class ExtraHotelero extends Alojamiento {
    protected boolean privado;
    protected double cantMts2;
    protected double precioHab;
    
    public ExtraHotelero(String nombre, String direccion, String localidad, String gerente, boolean privado,
            double cantMts2, double precioHab) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantMts2 = cantMts2;
        this.precioHab = precioHab;
    }

    


    public boolean isPrivado() {
        return privado;
    }




    public void setPrivado(boolean privado) {
        this.privado = privado;
    }




    public double getCantMts2() {
        return cantMts2;
    }




    public void setCantMts2(double cantMts2) {
        this.cantMts2 = cantMts2;
    }




    public double getPrecioHab() {
        return precioHab;
    }




    public void setPrecioHab(double precioHab) {
        this.precioHab = precioHab;
    }




    @Override
    public String toString() {
      
        return super.toString()
        +". Alojamiento privado: "+privado
        +". Cantidad de Mts2: "+cantMts2
        +". Precio de alquiler: "+precioHab;
    }

    

}
