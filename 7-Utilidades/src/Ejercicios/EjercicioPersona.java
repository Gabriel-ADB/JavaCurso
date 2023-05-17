

package Ejercicios;

 // @author Gabriel
import Entidades.Persona;
import Servicio.PersonaService;


public class EjercicioPersona {

   
    public static void main(String[] args) {
        PersonaService service = new PersonaService();
        Persona persona1 = service.crearPersona();
        
        service.calcularEdad(persona1);
        System.out.println(service.menorQue(persona1, 50));
        
        service.mostrar(persona1);
    }

}
