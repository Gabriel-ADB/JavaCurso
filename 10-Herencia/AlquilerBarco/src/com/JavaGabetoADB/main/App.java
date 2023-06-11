package com.JavaGabetoADB.main;
import com.JavaGabetoADB.Servicio.AlquilerServicio;

public class App {
    public static void main(String[] args) throws Exception {
       AlquilerServicio servicio = new AlquilerServicio();

       
       servicio.alquilerMenu(servicio.crearMenu());

      
    }

    
}
