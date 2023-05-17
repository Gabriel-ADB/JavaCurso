

package Ejercicios;

 // @author Gabriel
import Entidades.Cafetera;
import Servicios.CafeteraService;






public class EjercicioCafetera {

   
    public static void main(String[] args) {
        
       Cafetera c1 = new Cafetera(1000,500);
        
        CafeteraService servi =new CafeteraService();
        
        servi.vaciar(c1);
        servi.llenar(c1);
        servi.ServirTaza(c1);
        servi.vaciar(c1);
        servi.agregar(c1);
        servi.ServirTaza(c1);
        servi.toString();
       
    }

}
