package Ejercicios;

// @author Gabriel
import Entidades.Cadena;
import Servicio.CadenaServicio;

public class EjercicioCadena {
    
    public static void main(String[] args) {
        
        CadenaServicio service = new CadenaServicio();
        
        Cadena c1 = new Cadena();
        
        service.MostrarVocales(c1);
       
        service.unirFraces(c1);
        
    }
    
}
