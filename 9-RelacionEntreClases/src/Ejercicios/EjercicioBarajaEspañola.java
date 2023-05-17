

package Ejercicios;

 // @author Gabriel
import Entidades.Baraja;


public class EjercicioBarajaEspañola {

   
    public static void main(String[] args) {
         Baraja b1 = new Baraja();
        
      
        b1.llenarBaraja();
        
        System.out.println("========================");
         System.out.println("Baraja llena.");
        b1.mostrar();

        System.out.println("========================");
        System.out.println("Se mezclo la baraja.");
        b1.barajar();

        System.out.println("========================");

        b1.mostrar();

        System.out.println("========================");
        System.out.println("La primer carta es:");
        b1.siguenteCarta();

        System.out.println("========================");
        
        b1.darCartas();

        System.out.println("========================");
  
        b1.cartasMonton();

        System.out.println("========================");
        
        b1.cartasDisponibles();

        System.out.println("========================");

        b1.mostrar();

       
    }

}
