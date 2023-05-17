

package Ejercicios;

 // @author Gabriel
import Clases.Empleado;


public class EjercicioEmpleado {

   
    public static void main(String[] args) {
       Empleado c1 = new Empleado("Gabriel", 35,100);
       c1.CalcularAumento();
        System.out.println(c1.toString());
        System.out.println(c1);
    }
    

}
