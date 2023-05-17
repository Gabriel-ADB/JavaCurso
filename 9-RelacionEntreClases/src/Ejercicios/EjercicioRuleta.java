package Ejercicios;


import Entidades.Revolver;
import Entidades.Juego;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;



 // @author Gabriel
public class EjercicioRuleta {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Este es el juego de la ruleta rusa de agua.");
        System.out.println("Seleccione la cantidad de jugadores (1-6)");
        System.out.println("=====================");
      
        int cantJ= sc.nextInt();
        if (cantJ<1 || cantJ>6)
        {cantJ=6;
            
        }
          System.out.println("Cliiiiiiiiick, clack! Se cargo el arma.");
          System.out.println(" Que comienze el juego!");
          
        ArrayList<Jugador>jugadores= new ArrayList<>();
        
        for (int i = 0; i < cantJ; i++)
        {Jugador j1 =new Jugador((i+1));
        jugadores.add(j1);
            
        }
        
        Revolver revolver = new Revolver();
        
        revolver.llenarRevolver();
        
        Juego juego1 = new Juego(jugadores,revolver);
        
        juego1.ronda();
            
        
    }

}
