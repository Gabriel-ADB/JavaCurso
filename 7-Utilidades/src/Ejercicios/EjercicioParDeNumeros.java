

package Ejercicios;

 // @author Gabriel
import Entidades.ParNumeros;
import Servicio.ParNumerosService;


public class EjercicioParDeNumeros {

   
    public static void main(String[] args) {
       ParNumerosService service = new ParNumerosService();
       
       ParNumeros p1 = new ParNumeros();
       
       service.mostrarValores(p1);
       service.devolverMayor(p1);
       service.calcularPotencia(p1);
       service.calculaRaiz(p1);
       
    }

}
