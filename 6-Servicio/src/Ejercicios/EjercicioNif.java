

package Ejercicios;

 // @author Gabriel
import Entidades.Nif;
import Servicios.NifService;


public class EjercicioNif {

   
    public static void main(String[] args) {
        
        NifService service = new NifService();
       
        Nif n1 = new Nif();
        
        service.CrearNif();
        service.mostrar();
    }

}
