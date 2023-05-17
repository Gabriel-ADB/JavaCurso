package Ejercicios;

// @author Gabriel

import Servicio.ServicioMascota;



public class EjercicioMascota {

    public static void main(String[] args) {
        
        ServicioMascota serviceMascota = new ServicioMascota();
        
        serviceMascota.crearObjetos(5);
        
        serviceMascota.personaElije();
        serviceMascota.mostrar();
        
        
        
    }
    
}