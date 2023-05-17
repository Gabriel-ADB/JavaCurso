

package Ejercicios;

 // @author Gabriel
import Clases.Circunferencia;




public class Circunferencia1 {

   
    public static void main(String[] args) {
 
         Circunferencia c1 = new Circunferencia();
         c1.inicializar();
         c1.Area();
         c1.Perimetro();
         
        System.out.println("El area de la circuferencia es :"+c1.area+" y el perimetro: "+c1.perimetro);
    }

}
