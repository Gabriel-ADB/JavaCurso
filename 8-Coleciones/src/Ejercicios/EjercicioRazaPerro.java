
package Ejercicios;

 // @author Gabriel
import Servicio.MascotaService;


public class EjercicioRazaPerro {

   
    public static void main(String[] args) {
        
        MascotaService service = new MascotaService(); 
        
       
        
        service.cargarMascot();
        
        System.out.println("--------Eliminar--------");
       service.eliminarMascota();
       
       service.mostrar();
    }
    

}
