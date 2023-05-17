

package Entidades;

 // @author Gabriel
import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;


public class Ejercicio_01 {

   
    public static void main(String[] args) {
        
        Perro perro1 = new Perro("chiquito","perro",5,"grande");
        Perro perro2 = new Perro("lola","perra",10,"mediana");
        
        ArrayList <Perro> lista = new ArrayList<>();
        
        lista.add(perro1);
        lista.add(perro2);
        
   
        
        Persona p1 = new Persona("Diego","Perez",35,33688567,lista);
        Persona p2 = new Persona("Maria","Perez",33,33688567,lista);
        
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
       
    }

}
