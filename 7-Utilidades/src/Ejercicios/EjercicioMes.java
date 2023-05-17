

package Ejercicios;

 // @author Gabriel
import java.util.Random;
import java.util.Scanner;


public class EjercicioMes {
    Random r1 = new Random();

   
    public static void main(String[] args) {
        
    String [] Mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    String MesSecreto = Mes[r1.nextInt(12)];
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Adivina que mes es el secreto, introducelo en minusculas");
        String buscarMes = sc.nextLine();
        
        while (!buscarMes.equals(MesSecreto))
        {System.out.println("Incorrecto, intentalo de nuevo! Ingresa el mes:");
        buscarMes=sc.nextLine();
            
        }
        System.out.println("Genial adivinaste el mes! La respuesta correcta es:"+ MesSecreto );
       
    }

}
