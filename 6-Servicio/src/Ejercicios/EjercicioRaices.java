package Ejercicios;

// @author Gabriel
import Entidades.Raices;
import Servicios.RaicesServicio;

public class EjercicioRaices {

    public static void main(String[] args) {

        RaicesServicio service = new RaicesServicio();

        Raices rr1 = new Raices(2, 9, 2);
        
        
      service.getDiscriminante(rr1);
      service.verDiscriminante(rr1);
      service.tieneRaices(rr1);
      service.verTieneRacies(rr1);
      service.obtenerRaices(rr1);
      service.calcular(rr1);
    }
}
