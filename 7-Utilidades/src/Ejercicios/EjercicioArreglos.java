

package Ejercicios;

 // @author Gabriel
import Servicio.ArregloService;


public class EjercicioArreglos {

   
    public static void main(String[] args) {
        
        double [] arreglo1 = new double [50];
        double [] arreglo2 = new double [20];
        
        ArregloService service = new ArregloService();
        
        service.iniciaA(arreglo1);
        service.mostrar(arreglo1);
        service.ordenar(arreglo1);
        service.mostrar(arreglo1);
        
        
        service.iniciaB(arreglo1, arreglo2);
        service.mostrar(arreglo2);
    }

}
