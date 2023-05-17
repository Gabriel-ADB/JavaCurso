

package Ejercicios;

 // @author Gabriel
import Entidades.Persona;
import Servicios.PersonService;


public class EjercicioPersona {

   
    public static void main(String[] args) {
       
        PersonService service = new PersonService();
        
        Persona pp1 = service.crearPersona();
       
        service.esMayor(pp1);
        service.calcularIMC(pp1);
        System.out.println(service.esMayor(pp1));
        System.out.println(service.calcularIMC(pp1));
       
    }    

}
