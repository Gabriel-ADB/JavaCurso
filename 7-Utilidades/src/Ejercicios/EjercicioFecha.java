

package Ejercicios;

 // @author Gabriel
import Servicio.FechaService;
import java.util.Date;


public class EjercicioFecha {

   
    public static void main(String[] args) {
        
       FechaService servicio = new FechaService();
       
       Date d1 = new Date();
       
       servicio.fechaNac(d1);
     
       servicio.fechaActual(d1);
       
       
    }

}
