/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita 
a dos jugadores jugar un juego de adivinanza de números. El primer jugador
elige un número y el segundo jugador intenta adivinarlo. El segundo jugador 
tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo"
después de cada intento. El juego termina cuando el segundo jugador adivina el
número o se queda sin intentos. Registra el número de intentos necesarios para 
adivinar el número y el número de veces que cada jugador ha ganado.
fs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Juego {

    private int num1, num2;

    public Juego() {

    }

    public Juego(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void Iniciar() {
        
        Scanner sc = new Scanner(System.in);
        this.num1=7;
        System.out.println("ES HORA DE JUGAR!!");
        
        int k=0;
       
        
        
        System.out.println("jugador 2 ingrese numero");
        this.num2=sc.nextInt();

        if (num2==num1)
            {System.out.println("Ganaste");
            
                
            } else{  
        
        do{
        
        if(num2<num1){
            System.out.println("Mas alto");
          
            System.out.println("intenta de nuevo");
            this.num2=sc.nextInt();
            k++;
            
              
        }else   {
            System.out.println("Mas bajo");
            
           
            System.out.println("intenta de nuevo");
            this.num2=sc.nextInt();
            k++;
            
            
        }
            
        } while (k!=4);
        if(k==4){
            System.out.println("te quedaste sin intentos");
        }
        
    }
    
}
}